package com.srini.generic;

public class Admin extends Employee<Admin> {

	@Override
	public void empSection() {
		System.out.println("Admin Section");
	}

}
