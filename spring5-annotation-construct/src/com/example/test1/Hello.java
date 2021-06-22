package com.example.test1;

import org.springframework.stereotype.Component;

@Component
public class Hello implements IHello {
	@Override
	public String getHello() {
		return "Hello World!";
	}
}