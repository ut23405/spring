package com.example.test1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {	
	@Bean
	Syain syain() {
		return new Syain();
	}
	@Bean
	@Profile("product")
	Hello1 hello1() {
		return new Hello1();
	}
	@Bean
	@Profile("test")
	Hello2 hello2() {
		return new Hello2();
	}
}