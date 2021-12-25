package com.example.test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context 
				= new AnnotationConfigApplicationContext(TestConfig.class);
		
		SyainService syainService = context.getBean(SyainService.class);
		
		System.out.println(syainService.getHello()); // Hello World!
		context.close();
	}
}