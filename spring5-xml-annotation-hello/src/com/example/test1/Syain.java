package com.example.test1;
import org.springframework.stereotype.Component;

@Component
public class Syain implements ISyain {
	@Override
	public String getHello() {
		return "Hello World!";
	}
}