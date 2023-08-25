package com.example.jwtnew.model;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.OneToOne;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User implements UserDetails {

	@Id
	private String useridString;
	
	private String emailString;
	
	
	private String nameString;
	
	private String passString;


	@OneToOne(mappedBy = "user")
	@JsonIgnore
	private RefreshToken refreshToken;


	public User() {
	
		// TODO Auto-generated constructor stub
	}

	public User(String useridString, String emailString, String nameString, String passString, RefreshToken refreshToken) {
		this.useridString = useridString;
		this.emailString = emailString;
		this.nameString = nameString;
		this.passString = passString;
		this.refreshToken = refreshToken;
	}


	public String getUseridString() {
		return useridString;
	}

	public void setUseridString(String useridString) {
		this.useridString = useridString;
	}

	public String getEmailString() {
		return emailString;
	}

	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getPassString() {
		return passString;
	}

	public void setPassString(String passString) {
		this.passString = passString;
	}

	public RefreshToken getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(RefreshToken refreshToken) {
		this.refreshToken = refreshToken;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.emailString;
	}


	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.passString;
	}


	@Override
	public String toString() {
		return "User{" +
				"useridString='" + useridString + '\'' +
				", emailString='" + emailString + '\'' +
				", nameString='" + nameString + '\'' +
				", passString='" + passString + '\'' +
				", refreshToken=" + refreshToken +
				'}';
	}
}
