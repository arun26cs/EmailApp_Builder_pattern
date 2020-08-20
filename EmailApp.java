package com.canalogies.email;

public class EmailApp {

	public static void main(String[] args) {
		EmailBuilder eb = new CompanyEmailBuilder();
		EmailEngineer engineer = new EmailEngineer(eb);
		engineer.executeEmailBuilding();
		System.out.println(engineer.getEmail());
		
	}
}
