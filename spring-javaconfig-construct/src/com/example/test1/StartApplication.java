package com.example.test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TestConfig.class);
		SyainService syain = context.getBean(SyainService.class);
		System.out.println(syain.getHello()); //Hello World!
		context.close();
	}
}