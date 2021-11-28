package com.example.test1;

import org.springframework.stereotype.Component;

@Component
public class Syain {
	private Hello hello1;

	public Syain(Hello a) {
		this.hello1 = a;
	}
	public String getHello() {
		return hello1.getHello();
	}
}