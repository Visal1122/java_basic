package com.visal.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.visal")
public class BeanConfig {
	@Bean
	public GreetingService greetingService () {
		return new GreetingInEnglish();
	}
	@Bean
	public GreetingClient greetingClient() {
		return new GreetingClient();
	}
}
