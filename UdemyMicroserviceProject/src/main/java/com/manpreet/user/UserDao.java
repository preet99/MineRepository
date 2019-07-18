package com.manpreet.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

	private static List<User> users = new ArrayList<User>();

	private static int userCount = 3;

	static {
		users.add(new User(1, "Manne", new Date()));
		users.add(new User(2, "Ashish", new Date()));
		users.add(new User(2, "Nisha", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public void saveUser(User user) {
		List<User> userFound = users.stream().filter(it -> it.getId() != user.getId()).collect(Collectors.toList());
		if (userFound != null) {
			users.add(user);
		}
	}

	public User getById(long id) {
		List<User> userFound = users.stream().filter(it -> it.getId() == id).collect(Collectors.toList());
		if (userFound != null) {
			return userFound.get(0);
		} else {
			return null;	
		}
	}

}
