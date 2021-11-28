package com.example.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Syain syain = context.getBean("testSyain", Syain.class);
		System.out.println(syain.getHello()); //Hello World!
		context.close();
	}
}