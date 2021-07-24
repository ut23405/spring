package com.example.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello1Controller {
	@GetMapping("/")
    public String hello() {
        return "hellotest";
    }
}
