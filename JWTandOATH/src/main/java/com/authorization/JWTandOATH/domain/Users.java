package com.authorization.JWTandOATH.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Users {

	@PrimaryKeyJoinColumn
	private String username;

	private String password;
	@Id
	private long id;
	private boolean enabled;

	@OneToMany
	@JoinTable(name = "authorities", joinColumns = {
			@JoinColumn(name = "username", referencedColumnName = "username") }, inverseJoinColumns = {
					@JoinColumn(name = "authority", referencedColumnName = "name", unique = true) })
	private Set<Role> authorities;

}
