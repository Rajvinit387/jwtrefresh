package com.example.jwtnew.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.jwtnew.model.User;
import com.example.jwtnew.repo.userrepo;


@Service
public class customservice  implements UserDetailsService{
	
	
	@Autowired
	private userrepo userrepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
	User user=	userrepo.findByEmailString(username).orElseThrow(()-> new RuntimeException("user not found"));
	return user;
		
	}

}
