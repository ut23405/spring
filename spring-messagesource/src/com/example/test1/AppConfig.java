package com.example.test1;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	@Bean
	Syain syain() {
		return new Syain();
	}
	@Bean
	MessageSource msgSource() {
	    ResourceBundleMessageSource msgSource = 
	    		new ResourceBundleMessageSource();
	    msgSource.setBasename("testFile");
	    return msgSource;
	}
}