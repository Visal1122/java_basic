package com.visal.learning;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Subject {
	
	@PostConstruct
	public void init() {
		System.out.println("Subject Created");
	}
	@PreDestroy
	public void clean() {
		System.out.println("Subject destroy");
	}
	public void set() {
		System.out.println("Setter method is called");
	}
}
