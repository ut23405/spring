package com.example.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

//		ISyain syain = context.getBean("testSyain", ISyain.class);
		ISyain syain = context.getBean(ISyain.class);

		System.out.println(syain.getHello()); //Hello World!
		context.close();
	}
}