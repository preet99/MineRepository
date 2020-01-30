package com.authorization.JWTandOATH.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authorization.JWTandOATH.domain.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

	/*@Query("select from Users where username: userName")
	public Users findByUsername(String userName);*/
	
}
