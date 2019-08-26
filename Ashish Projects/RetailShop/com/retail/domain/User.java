package com.retail.domain;

public class User {
	
	private Long id;
	private UserRole role;
	private String name;
	private Long rewardPoints;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(Long rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

}
