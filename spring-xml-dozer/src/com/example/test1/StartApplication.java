package com.example.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		SyainService syainService 
				= context.getBean(SyainService.class);
		syainService.copySyain(); 
		context.close();
	}
}