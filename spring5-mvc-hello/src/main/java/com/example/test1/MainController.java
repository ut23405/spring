package com.example.test1;

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

	@GetMapping("/abc")
	public String hello(Model model) {
		model.addAttribute("moji", "hello world!");
		return "/test1/index";
	}
}
