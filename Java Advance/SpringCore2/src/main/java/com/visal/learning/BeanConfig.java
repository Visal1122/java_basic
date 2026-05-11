package com.visal.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean
	public GreetingService greetingService () {
		return new GreetingInKhmer();
	}
	@Bean
	public GreetingClient greetingClient() {
		return new GreetingClient();
	}
}
