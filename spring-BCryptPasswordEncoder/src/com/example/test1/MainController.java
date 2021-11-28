package com.example.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Test cs = context.getBean(Test.class);
		cs.chkPassword();
		context.close();
	}
}