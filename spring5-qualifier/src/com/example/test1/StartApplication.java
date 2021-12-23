package com.example.test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.test1.service.SyainService;

public class StartApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		SyainService syain = context.getBean(SyainService.class);
		System.out.println(syain.getColor()); //設定により変わる
		context.close();
	}
}