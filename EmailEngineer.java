package com.canalogies.email;

public class EmailEngineer {

	
	private EmailBuilder emailBuilder;
	
	public EmailEngineer(EmailBuilder emailbuilder) {
		this.emailBuilder=emailbuilder;
				
	}
	
	public void executeEmailBuilding() {
		this.emailBuilder.makeFirstName();
		this.emailBuilder.makeLastName();
		this.emailBuilder.makeDepartment();
		this.emailBuilder.makeEmail();
		this.emailBuilder.makePassword();
	}
	
	public String getEmail() {
		return this.emailBuilder.getEmail();
	}
}
