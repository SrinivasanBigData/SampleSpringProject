package com.srini.generic;

import org.springframework.beans.factory.annotation.Autowired;

public class InjectBeans {
	@Autowired
	Employee<Manager> emp1;
	@Autowired
	Employee<Admin> emp2;

	public void invokeManager() {
		emp1.empSection();
	}

	public void invokeAdmin() {
		emp2.empSection();
	}
}
