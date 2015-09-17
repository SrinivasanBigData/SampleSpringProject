package com.srini.generic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringMVCConfiguration.class);
		InjectBeans beans = (InjectBeans) context.getBean("InjectBeans");
		beans.invokeManager();
		beans.invokeAdmin();
		((AnnotationConfigApplicationContext) context).close();
	}
}
