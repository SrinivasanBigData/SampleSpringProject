package com.srini.generic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringMVCConfiguration {

	@Bean
	public Employee<Manager> getManager() {
		return new Manager();
	}

	@Bean
	public Employee<Admin> getAdmin() {
		return new Admin();
	}

	@Bean(name = "InjectBeans")
	public InjectBeans getInject() {
		return new InjectBeans();
	}

}
