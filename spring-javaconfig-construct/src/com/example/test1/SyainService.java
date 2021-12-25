package com.example.test1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SyainService {
	private Hello hello;

	public SyainService(@Qualifier("hello") Hello hello) {
		this.hello = hello;
	}
	public String getHello() {
		return hello.getHello();
	}
}