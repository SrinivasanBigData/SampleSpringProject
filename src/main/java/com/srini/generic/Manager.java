package com.srini.generic;

public class Manager extends Employee<Manager> {

	@Override
	public void empSection() {
		System.out.println("Manager Section");
	}

}
