package com.canalogies.email;

public interface EmailPlan {
	public final String COMPANY_NAME="straton";
	public final int PASSWORD_LENGTH=10;
	public void makeFirstName(String firstName);
	public void makeLastName(String lastName);
	public void makeDepartment(String department);
	public void makeEmail();
	public void makePassword(int PASSWORD_LENGTH);
	public String getEmail();
	
}
