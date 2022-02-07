package com.example.test1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {	
	@Bean
	SyainService createService() {
		return new SyainService();
	}
	@Bean
	@Profile("product")
	Msg1 Message1() {
		return new Msg1();
	}
	@Bean
	@Profile("test")
	Msg2 Message2() {
		return new Msg2();
	}
}