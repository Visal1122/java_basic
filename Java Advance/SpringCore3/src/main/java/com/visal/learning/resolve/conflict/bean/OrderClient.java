package com.visal.learning.resolve.conflict.bean;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Component
//@RequiredArgsConstructor
//@AllArgsConstructor

//@RequiredArgsConstructor
public class OrderClient {
	
@Qualifier("orderServiceA")
@Autowired
private OrderService orderService ;
	
//	public OrderClient(OrderService orderService) {
//		this.orderService = orderService;
//	}
	
//	@Autowired
//	public void setOrderService(OrderService orderService) {
//		this.orderService = orderService;
//	}
	public void displayOrder() {
		System.out.println(orderService.order());
	}
	
}
