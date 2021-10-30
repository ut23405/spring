package com.example.test1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * http://localhost:8881/spring5-mvc-hello/abc
 *
 */
@Controller
public class MainController {
	
	@Value("${item.upload.title}")
	private String fileTest;
	
	@GetMapping("/abc")
	public String hello(Model model) {
		System.out.println(fileTest);
		return "/test1/index";
	}
}
