package org.baeldung.persistence.model;

import javax.mail.Multipart;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private Multipart file;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
