package com.retail.store.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.retail.domain.User;
import com.retail.store.dao.UserDao;

public class UserDaoImpl implements UserDao {
	
	private List<User> users = new ArrayList<>();

	@Override
	public List<User> getUsers() {
		return this.users;
	}

	@Override
	public User getUser(Long id) {
		Optional<User> user = users.stream().filter(usr -> usr.getId().equals(id))
				.findFirst(); 
		return user.isPresent() ? user.get() : null;
	}

	@Override
	public void save(User user) {
		this.users.add(user);
	}

	@Override
	public Long getNextId() {
		return (long) users.size() + 1;
	}
	
}
