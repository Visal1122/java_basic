package com.visal.learning;

import org.springframework.beans.factory.annotation.Autowired;

public class GreetingClient {
	
	@Autowired
	private GreetingService greetingService;
	
	public void sayHi() {
		greetingService.sayHello();
	}
}
