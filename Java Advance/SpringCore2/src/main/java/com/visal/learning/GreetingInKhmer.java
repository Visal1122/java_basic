package com.visal.learning;

import org.springframework.stereotype.Component;

@Component
public class GreetingInKhmer implements GreetingService{

	@Override
	public void sayHello() {
		System.out.println("Sur Sdey");
		
	}
	

}
