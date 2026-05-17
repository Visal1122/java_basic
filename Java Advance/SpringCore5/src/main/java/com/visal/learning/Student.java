package com.visal.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Student {
	@Autowired
	Subject subject;

	@PostConstruct
	public void setup() {
		System.out.println("Student created");
	}
	@PreDestroy
	public void clear() {
		System.out.println("Student destroy");
	}

	public void display() {
		subject.set();
	}
}
