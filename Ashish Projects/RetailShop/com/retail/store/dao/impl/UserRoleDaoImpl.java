package com.retail.store.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.retail.domain.UserRole;
import com.retail.domain.UserRole.USER_ROLE;
import com.retail.domain.UserRole.USER_ROLE_NAME;
import com.retail.store.dao.UserRoleDao;

public class UserRoleDaoImpl implements UserRoleDao {
	
	private List<UserRole> userRoles = new ArrayList<>();
	
	public UserRoleDaoImpl() {
		super();
		init();
	}

	private void init() {
		for (USER_ROLE userRole : USER_ROLE.values()) {
			UserRole role = new UserRole();
			role.setId(this.getNextId());
			role.setRole(userRole);
			role.setRoleName(USER_ROLE_NAME.valueOf(userRole.name()));
			this.userRoles.add(role);
		}
	}

	@Override
	public List<UserRole> getRoles() {
		return this.userRoles;
	}

	@Override
	public UserRole getRole(USER_ROLE role) {
		Optional<UserRole> userRole = this.userRoles.stream().filter(rol -> rol.getRole().equals(role)).findFirst(); 
		return userRole.isPresent() ? userRole.get() : null;
	}

	@Override
	public void save(UserRole userRole) {
		this.userRoles.add(userRole);
	}

	@Override
	public Long getNextId() {
		return (long) userRoles.size() + 1;
	}

}
