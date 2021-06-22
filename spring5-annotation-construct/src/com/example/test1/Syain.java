package com.example.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Syain implements ISyain {

	private IHello hello1;

	@Autowired
	public Syain(IHello a) {
		this.hello1 = a;
	}
	@Override
	public String getHello() {
		return hello1.getHello();
	}
}