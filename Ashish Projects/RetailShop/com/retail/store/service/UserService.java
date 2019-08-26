package com.retail.store.service;

import java.util.List;
import java.util.Scanner;

import com.retail.domain.User;
import com.retail.domain.UserRole;
import com.retail.domain.UserRole.USER_ROLE;

public interface UserService {
	
	public void createUser(String userName, USER_ROLE role);
	
	public User getUser(Long id);
	
	public List<UserRole> getUserRoles();
	
	public void createUserFromConsole(Scanner scanner);

}
