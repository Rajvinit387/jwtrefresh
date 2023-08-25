package com.example.jwtnew.model;

public class JwtResponse {
	
private String jwttokenString;

private String usernameString;


private String refreshtokenString;

public JwtResponse() {
	super();
	// TODO Auto-generated constructor stub
}

public JwtResponse(String jwttokenString, String usernameString, String refreshtokenString) {
	super();
	this.jwttokenString = jwttokenString;
	this.usernameString = usernameString;
	this.refreshtokenString = refreshtokenString;
}

public String getJwttokenString() {
	return jwttokenString;
}

public void setJwttokenString(String jwttokenString) {
	this.jwttokenString = jwttokenString;
}

public String getUsernameString() {
	return usernameString;
}

public void setUsernameString(String usernameString) {
	this.usernameString = usernameString;
}

public String getRefreshtokenString() {
	return refreshtokenString;
}

public void setRefreshtokenString(String refreshtokenString) {
	this.refreshtokenString = refreshtokenString;
}

@Override
public String toString() {
	return "JwtResponse [jwttokenString=" + jwttokenString + ", usernameString=" + usernameString
			+ ", refreshtokenString=" + refreshtokenString + "]";
}








}
