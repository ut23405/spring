package com.example.test1;

import org.springframework.stereotype.Component;

@Component
public class SyainService  {
	private final Hello hello;
	
	public SyainService(Hello hello) {
		this.hello = hello;
	}
	public String getHello() {
		return hello.getHello();
	}
}