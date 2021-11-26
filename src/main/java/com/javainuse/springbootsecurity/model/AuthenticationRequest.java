package com.javainuse.springbootsecurity.model;

public class AuthenticationRequest {
	
	private String emailid;
	private String password;
	
	
	public AuthenticationRequest(String emailid, String password) {
		super();
		this.emailid = emailid;
		this.password = password;
	}
	
	public AuthenticationRequest()
	{
		
	}
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
