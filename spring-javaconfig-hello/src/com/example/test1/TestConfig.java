package com.example.test1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
	@Bean
	SyainService SyainService() {
		return new SyainService();
	}
}