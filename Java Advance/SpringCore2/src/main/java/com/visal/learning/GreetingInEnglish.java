package com.visal.learning;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GreetingInEnglish implements GreetingService{

	@Override
	public void sayHello() {
		System.out.println("Hello");
		
	}
	
}
