package com.example.test1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Syain {
	@Autowired
	@Qualifier("test2")
	private IHello obj1;

	public String getHello() {
		return obj1.getHello();
	}
}