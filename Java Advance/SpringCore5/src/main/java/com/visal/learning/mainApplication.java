package com.visal.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(BeanConfig.class);
//		contex.registerShutdownHook();
		Student bean = contex.getBean(Student.class);
		bean.display();
		contex.close();
		
	}
	
}
