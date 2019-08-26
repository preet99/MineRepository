package com.retail.store.dao;

import java.util.List;

import com.retail.domain.User;

public interface UserDao {
	
	public Long getNextId();
	
	public List<User> getUsers();
	
	public User getUser(Long id);
	
	public void save(User user);

}
