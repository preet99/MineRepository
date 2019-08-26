package com.retail.store.dao;

import java.util.List;

import com.retail.domain.UserRole;
import com.retail.domain.UserRole.USER_ROLE;

public interface UserRoleDao {
	
	public Long getNextId();
	
	public List<UserRole> getRoles();
	
	public UserRole getRole(USER_ROLE role);
	
	public void save(UserRole userRole);

}
