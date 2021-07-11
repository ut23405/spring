package com.example.test1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Hello1 implements IHello {
	@Override
	public String getHello() {
		return "Hello World!";
	}
}
