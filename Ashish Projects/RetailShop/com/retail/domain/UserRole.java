package com.retail.domain;

public class UserRole {
	
	public enum USER_ROLE {
		GUEST(0l), STANDARD(1l), GOLD(2l), EMPLOYEE(5l);
		
		private Long value;
		private USER_ROLE(Long value) {
			this.value = value;
		}
		
		public Long getValue() {
			return this.value;
		}
	}
	
	public enum USER_ROLE_NAME {
		GUEST("Guest"), STANDARD("Standard"), GOLD("Gold"), EMPLOYEE("Employee");
		
		private String value;
		private USER_ROLE_NAME(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return this.value;
		}
	}
	
	private Long id;
	private USER_ROLE role;
	private USER_ROLE_NAME roleName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public USER_ROLE getRole() {
		return role;
	}
	public void setRole(USER_ROLE role) {
		this.role = role;
	}
	public USER_ROLE_NAME getRoleName() {
		return roleName;
	}
	public void setRoleName(USER_ROLE_NAME roleName) {
		this.roleName = roleName;
	}
}
