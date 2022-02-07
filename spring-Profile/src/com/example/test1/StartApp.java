package com.example.test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		SyainService syainService = context.getBean(SyainService.class);
		
		System.out.println(syainService.getMessage()); //設定により変わる
		
		context.close();
	}
}