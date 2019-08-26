package com.retail.store.service.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.retail.domain.User;
import com.retail.domain.UserRole;
import com.retail.domain.UserRole.USER_ROLE;
import com.retail.store.dao.UserDao;
import com.retail.store.dao.UserRoleDao;
import com.retail.store.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	private UserRoleDao userRoleDao;

	public UserServiceImpl(UserDao userDao, UserRoleDao userRoleDao) {
		super();
		this.userDao = userDao;
		this.userRoleDao = userRoleDao;
	}

	@Override
	public void createUser(String userName, USER_ROLE role) {
		User user = new User();
		user.setName(userName);
		user.setRewardPoints(0l);
		user.setId(userDao.getNextId());
		user.setRole(userRoleDao.getRole(role));
		userDao.save(user);
	}

	@Override
	public User getUser(Long id) {
		return userDao.getUser(id);
	}
	
	@Override
	public List<UserRole> getUserRoles() {
		return userRoleDao.getRoles();
	}

	@Override
	public void createUserFromConsole(Scanner scanner) {
		System.out.println("\n---------------  Create User  ---------------\n");
		USER_ROLE userrole = getRoleFromConsole(scanner);
		String name = getUserNameFromConsole(scanner);
		
		createUser(name, userrole);
		System.out.println("User " + name + " is succesfully created");
	}

	private String getUserNameFromConsole(Scanner scanner) {
		String userName;
		while(true) {
			System.out.println("\nPlease enter the member name : ");
			userName = scanner.next();
			if ("".equals(userName)) {
				System.out.println("\nName cannot be left blank selected entered. Please try again.");
				continue;
			}
			System.out.println("\nMember name entered is : " + userName);
			System.out.println("\nEnter 1 and press the enter key to re-enter the user name.");
			System.out.println("\nOr simply press enter to continue...");
			int option = getOptionFromUser(scanner);
			if (option == 1) {
				continue;
			}
			break;
		}
		return userName;
	}

	private USER_ROLE getRoleFromConsole(Scanner scanner) {
		
		List<UserRole> userRoleList = userRoleDao.getRoles().stream()
				.sorted(Comparator.comparing(UserRole::getId, (v1, v2) -> v1.compareTo(v2)))
				.collect(Collectors.toList());
		
		Long roleId;
		while(true) {
			System.out.println("\nPlease enter a number to select a role :-");
			userRoleList.forEach(role -> System.out.println("\n"+role.getId() + ". " + role.getRoleName().getValue()));
			roleId = new Long(getOptionFromUser(scanner));
			if (roleId < 1 && roleId > userRoleList.size()) {
				System.out.println("\nInvalid option selected entered. Please try again.");
				continue;
			}
			break;
		}
		Long id = roleId;
		return userRoleList.stream().filter(role -> role.getId().equals(id)).map(UserRole::getRole).findFirst().get();
	}
	
	private int getOptionFromUser(Scanner scanner) {
		int option;
		while(true) {
			String input = scanner.next();
			try {
				option = Integer.parseInt(input);
			} catch (Exception e) {
				System.out.println("\nInvalid option selected entered. Please try again.");
				continue;
			}
			break;
		}
		return option;
	}

}
