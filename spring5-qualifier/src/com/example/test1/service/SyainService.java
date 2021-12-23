package com.example.test1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.test1.IColor;

@Component
public class SyainService {
	@Autowired
	@Qualifier("red")
	private IColor color;
	
	public String getColor() {
		return color.getColor();
	}
}