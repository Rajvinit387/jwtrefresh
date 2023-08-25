package com.example.jwtnew.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwtnew.model.User;

public interface userrepo  extends JpaRepository<User, String>{

	
	
	public Optional<User> findByEmailString(String email);
	
}
