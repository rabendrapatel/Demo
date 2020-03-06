package com.source.request;

import java.io.Serializable;

public class AuthenticationRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
	
	private String userName;
	private String password;
	private String token;
	
	public AuthenticationRequest(){
	}

	public AuthenticationRequest(String userName, String password) {
		this.setUserName(userName);
		this.setPassword(password);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}