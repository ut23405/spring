package com.example.test1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * http://localhost:8881/spring5-mvc-properties/abc
 *
 */
@Controller
public class MainController {

	@Value("${syain.name1}")
	private String testName1;
	
	@GetMapping("/abc")
	public String hello(Model model) {
		System.out.println(testName1); // suzuki
		model.addAttribute("moji", "hello world!");
		return "/test1/index";
	}
}
