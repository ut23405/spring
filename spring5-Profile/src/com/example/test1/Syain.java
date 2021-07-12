package com.example.test1;
import org.springframework.beans.factory.annotation.Autowired;

public class Syain {
	@Autowired
	private IHello obj1;

	public String getHello() {
		return obj1.getHello();
	}
}