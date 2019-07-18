package com.manpreet.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	private UserDao userDao;

	@GetMapping(path ="/users")
	private List<User> retrieveListOfUSers() {
		return userDao.findAll();
	}

	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	public User retrieveById(long id) {
		return userDao.getById(id);
	}
}
