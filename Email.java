package com.canalogies.email;

import java.util.Random;

public class Email implements EmailPlan {

	//made this class on the plan and would be inroduced to the different builders so they customize it.
	private String firstName;
	private String lastName;
	private String department;
	private String company;
	private String email;
	private String password;
	@Override
	public void makeFirstName(String firstName) {
		this.firstName =firstName;
		
	}

	@Override
	public void makeLastName(String lastName) {
		this.lastName=lastName;
		
	}

	@Override
	public void makeDepartment(String department) {
		this.department=department;
		
	}

	@Override
	public void makeEmail() {
		this.email=firstName+"."+lastName+"@"+department+"."+COMPANY_NAME+".com";
		
	}

	@Override
	public void makePassword(int PASSWORD_LENGTH) {
		String passwordchars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for(int i=0;i<Email.PASSWORD_LENGTH;i++) {
			int randomIdx = (int) (Math.random()*passwordchars.length());
			sb.append(passwordchars.charAt(randomIdx));
		}
		System.out.println(sb.toString());
		this.password=sb.toString();
		
		
	}

	@Override
	public String getEmail() {
		
		return this.email;
	}

	 

}
