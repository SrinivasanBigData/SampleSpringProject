package com.srini.basic;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
		context.close();
	}
}
