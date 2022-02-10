package com.example.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * http://localhost:8881/spring5-mvc-hello/abc
 */
@Controller
public class MainController {

	@GetMapping("/abc")
	public String hello() {
		int i = 1;
		if (i == 1) {
			throw new NullPointerException();
		}
		return "/test1/index";
	}
	@GetMapping("/testNotFound")
	public String test1() {
		return "/error/test404";
	}
	@GetMapping("/testException")
	public String test2() {
		return "/error/testError";
	}
}
