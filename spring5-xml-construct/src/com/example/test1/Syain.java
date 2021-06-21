package com.example.test1;

public class Syain implements ISyain {
	private Hello hello1;
	
	public Syain(Hello a) {
		this.hello1 = a;
	}
	@Override
	public String getHello() {
		return hello1.getHello();
	}
}