package com.visal.learning.resolve.conflict.bean;

import org.springframework.stereotype.Component;

@Component
public class OrderServiceB implements OrderService{

	@Override
	public String order() {
		// TODO Auto-generated method stub
		return "Order from service b";
	}
	
}
