package com.infinite.loginspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginPage {
	@RequestMapping("/login")
	public String login() {
		System.out.println("You are at the logging page");
		return "index";


		
		
}
}