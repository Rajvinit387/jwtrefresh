package com.example.jwtnew.service;

import java.time.Instant;
import java.util.UUID;

import com.example.jwtnew.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jwtnew.model.RefreshToken;
import com.example.jwtnew.repo.refreshtokenrepository;
import com.example.jwtnew.repo.userrepo;

@Service
public class rtservice {
	
	
	
	public long refreshtokenvalidityString= 5*60*60*1000;
	
	@Autowired
	private refreshtokenrepository refreshtokenrepository;
	
	
	@Autowired
	private userrepo userrepo;
	
	public RefreshToken createRefreshToken(String username)
	{

		User user=userrepo.findByEmailString(username).get();
		RefreshToken refreshToken= user.getRefreshToken();
		if(refreshToken==null) {
			RefreshToken refreshToken1= new RefreshToken();
			refreshToken1.setRefreshtokString(UUID.randomUUID().toString());
			refreshToken1.setExpiryInstant("valid");
			refreshToken1.setUser(user);
			user.setRefreshToken(refreshToken1);
			this.refreshtokenrepository.save(refreshToken1);
           return  refreshToken1;
		}
		else {
			refreshToken.setExpiryInstant("valid1");

			user.setRefreshToken(refreshToken);
			this.refreshtokenrepository.save(refreshToken);
			return refreshToken;
		}

		
	}
	
	
	public RefreshToken verifyRefreshToken(String refreshtoken)
	{
		
		
	RefreshToken refreshToken2=	refreshtokenrepository.findByRefreshtokString(refreshtoken).orElseThrow(() -> new RuntimeException("GIVEN REFRESH TOKEN DOES NOT EXISTS IN DB"));
	
		if(refreshToken2.getExpiryInstant().equals("Invalid"))
		{
			refreshtokenrepository.delete(refreshToken2);
			throw new RuntimeException("refresh token expired");
		}
		else
			return refreshToken2;
	}
	
	

}
