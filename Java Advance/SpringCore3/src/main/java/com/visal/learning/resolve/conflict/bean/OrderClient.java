package com.visal.learning.resolve.conflict.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderClient {
	@Qualifier("orderServiceA")
	@Autowired
	private OrderService orderService;
	
	public void displayOrder() {
		System.out.println(orderService.order());
	}
	
	@Qualifier("orderServiceB")
	@Autowired
	private OrderService orderServiceB;
	
	public void displayOrderB() {
		System.out.println(orderServiceB.order());
	}
}
