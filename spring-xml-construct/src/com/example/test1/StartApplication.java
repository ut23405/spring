package com.example.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApplication {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		SyainService syainService 
//				= (SyainService) context.getBean("testSyain");
				= context.getBean(SyainService.class);
		
		System.out.println(syainService.getHello()); //Hello World!
		context.close();
	}
}