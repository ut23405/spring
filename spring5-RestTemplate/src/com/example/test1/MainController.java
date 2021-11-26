package com.example.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		CommService cs = context.getBean(CommService.class);
		cs.getData();
		context.close();
	}
}