package com.visal.learning.resolve.conflict.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class OrderServiceA implements OrderService{

	@Override
	public String order() {
		// TODO Auto-generated method stub
		return "Order from service a";
	}

}
