package com.example.jwtnew.model;

import java.time.Instant;

import jakarta.persistence.*;


@Entity
@Table(name="refresh_token")
public class RefreshToken {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int refresh_token_id;
	

	private String refreshtokString;



	private String expiryInstant;
	
	
	@OneToOne
	private User user;


	public RefreshToken() {
	}


	public RefreshToken(int refresh_token_id, String refreshtokString, String expiryInstant, User user) {
		this.refresh_token_id = refresh_token_id;
		this.refreshtokString = refreshtokString;
		this.expiryInstant = expiryInstant;
		this.user = user;
	}

	public int getRefresh_token_id() {
		return refresh_token_id;
	}

	public void setRefresh_token_id(int refresh_token_id) {
		this.refresh_token_id = refresh_token_id;
	}

	public String getRefreshtokString() {
		return refreshtokString;
	}

	public void setRefreshtokString(String refreshtokString) {
		this.refreshtokString = refreshtokString;
	}

	public String getExpiryInstant() {
		return expiryInstant;
	}

	public void setExpiryInstant(String expiryInstant) {
		this.expiryInstant = expiryInstant;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "RefreshToken{" +
				"refresh_token_id=" + refresh_token_id +
				", refreshtokString='" + refreshtokString + '\'' +
				", expiryInstant='" + expiryInstant + '\'' +
				", user=" + user +
				'}';
	}
}
