package com.visal.learning;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GreetingApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class ,BeanConfig2.class);
		GreetingClient greetingClient = context.getBean(GreetingClient.class);
		greetingClient.sayHi();
		List<Integer> score = context.getBean(List.class);
		System.out.println(score);
	
	}
}
