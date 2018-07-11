package com.accenture.devops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {
	@GetMapping("")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/helloArjoon")
	public String helloArjoon(@RequestParam("name") String name,Model model) {
		String hello = "Hello "+name;
		model.addAttribute("hello",hello);
		return "hello";
	}

}
