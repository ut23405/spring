package com.example.test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainController {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TestConfig.class);

		Syain syain = context.getBean(Syain.class);

		System.out.println(syain.getHello()); //ê›íËÇ…ÇÊÇËïœÇÌÇÈ
		context.close();
	}
}