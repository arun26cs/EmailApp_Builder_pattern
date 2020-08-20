package com.canalogies.email;

public class CompanyEmailBuilder implements EmailBuilder{

	private Email email;
	public CompanyEmailBuilder() {
		this.email=new Email();
	}
	@Override
	public void makeFirstName() {
		this.email.makeFirstName("arun");
		
	}

	@Override
	public void makeLastName() {
		this.email.makeLastName("varghese");
		
	}

	@Override
	public void makeDepartment() {
		this.email.makeDepartment("cs");
		
	}

	@Override
	public void makeEmail() {
		this.email.makeEmail();
		
	}

	@Override
	public void makePassword() {
		this.email.makePassword(10);
		
	}

	@Override
	public String getEmail() {
		 
		return this.email.getEmail();
	}
	
	

	 

}
