package com.visal.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GreetingApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		GreetingClient greetingClient = context.getBean(GreetingClient.class);
		greetingClient.sayHi();
	}
}
