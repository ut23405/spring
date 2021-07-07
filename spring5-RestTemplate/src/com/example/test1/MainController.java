package com.example.test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainController {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TestConfig.class);

		CommService cs = context.getBean(CommService.class);

		cs.getData();
		context.close();
	}
}