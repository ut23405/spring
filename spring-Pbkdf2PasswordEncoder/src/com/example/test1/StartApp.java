package com.example.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		PasswordTest test = context.getBean(PasswordTest.class);
		test.chkPassword();
		context.close();
	}
}