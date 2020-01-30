package com.authorization.JWTandOATH.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
	
	@Id
	private Long id;
	
	private String name;

}
