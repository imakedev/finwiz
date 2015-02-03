package com.gl.finwiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.finwiz.domain.User;


//public interface UserRepository extends JpaRepository<User, Long> {
public interface UserRepository extends JpaRepository<User, Long> {
	
	//User findByUsername(String username);
	User findByUsername(String username);
}
