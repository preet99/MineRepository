package com.manpreet.user;

import java.util.Date;

public class User {

	private Long id;

	private String name;

	public User(long i, String name, Date birthDate) {
		super();
		this.id = i;
		this.name = name;
		this.birthDate = birthDate;
	}

	public User(long i, String name) {
		super();
		this.id = i;
		this.name = name;

	}
	public User()
	{
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	private Date birthDate;

}
