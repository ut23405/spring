package com.example.test1;

import org.springframework.stereotype.Component;

@Component(value = "test2")
public class Hello2 implements IHello {
	@Override
	public String getHello() {
		return "‚±‚ñ‚É‚¿‚Í!";
	}
}
