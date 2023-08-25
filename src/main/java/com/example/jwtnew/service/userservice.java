package com.example.jwtnew.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.jwtnew.model.User;
import com.example.jwtnew.repo.userrepo;

@Service
public class userservice {
	
	
	@Autowired
	private userrepo userrepo;
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	/* private List<User> store = new ArrayList<>();




public userservice() {

	store.add(new User(UUID.randomUUID().toString(),"vinit@gmail.com","vinit"));
	store.add(new User(UUID.randomUUID().toString(),"raj@gmail.com","raj"));
	store.add(new User(UUID.randomUUID().toString(),"jsr@gmail.com","jsr"));
	store.add(new User(UUID.randomUUID().toString(),"jr@gmail.com","jr"));
	
	
	
	
} */


public List<User> getusers()
{
	return this.userrepo.findAll();
}
	
public User createUser(User user)
{
	
	user.setUseridString(UUID.randomUUID().toString());
	user.setPassString(passwordEncoder.encode(user.getPassString()));
	 return userrepo.save(user);
}



}
