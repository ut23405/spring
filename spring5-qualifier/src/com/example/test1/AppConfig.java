package com.example.test1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.example.test1.service")
public class AppConfig {
	@Bean("red")
	IColor getRed() {
		return new ColorRed();
	}
	@Bean("yellow")
	IColor getYellow() {
		return new ColorYellow();
	}
	@Bean
	@Primary
	IColor getBlue() {
		return new ColorBlue();
	}
}