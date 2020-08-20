package com.canalogies.email;

public interface EmailBuilder {

	//this is a builder
	
	public void makeFirstName();
	public void makeLastName();
	public void makeDepartment();
	public void makeEmail();
	public void makePassword();
	public String getEmail();
	
}
