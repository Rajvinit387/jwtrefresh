package com.example.jwtnew.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwtnew.model.User;
import com.example.jwtnew.service.userservice;

@RestController
@RequestMapping("/home")
public class mycontroller {
	
	
	@Autowired
	private userservice userservice;
	
	@GetMapping("/user")
	public List<User> protectedapi()
	{
		System.out.println("getting users");
		return this.userservice.getusers();
		
	}
	
	@GetMapping("/currentuser")
	public String getuserloggString(Principal principal)
	{
	  return	principal.getName();
	}
	
	
	
	
	
	

}
