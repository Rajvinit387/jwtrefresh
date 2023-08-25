package com.example.jwtnew.model;

public class JwtRequest {

	
	private String emailString;
	
	
	private String passString;


	public JwtRequest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public JwtRequest(String emailString, String passString) {
		super();
		this.emailString = emailString;
		this.passString = passString;
	}


	public String getEmailString() {
		return emailString;
	}


	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}


	public String getPassString() {
		return passString;
	}


	public void setPassString(String passString) {
		this.passString = passString;
	}


	@Override
	public String toString() {
		return "JwtRequest [emailString=" + emailString + ", passString=" + passString + "]";
	}
	
	
	
	
}
