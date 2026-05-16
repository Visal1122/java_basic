package com.visal.learning.resolve.conflict.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		OrderClient orderClient = context.getBean(OrderClient.class);
		orderClient.displayOrder();
		orderClient.displayOrderB();
	}

}
