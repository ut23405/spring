package com.example.test1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	Syain syain() {
		return new Syain();
	}
}