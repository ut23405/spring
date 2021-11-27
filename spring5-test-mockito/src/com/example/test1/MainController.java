package com.example.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cs = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		Syain syain = cs.getBean(Syain.class);
		System.out.println(syain.getHello("suzuki"));//suzukiさんこんにちは
		cs.close();
	}
}