package com.vetsis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {

	@GetMapping("/hello")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "hello " + name;
	}
}
