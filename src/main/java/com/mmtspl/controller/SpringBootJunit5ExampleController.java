package com.mmtspl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.mmtspl.service.SpringBootJunit5ExampleService;

@RestController
public class SpringBootJunit5ExampleController {
	
	@Autowired
	private SpringBootJunit5ExampleService messageService;
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam String user) {
		return messageService.getSubscriptionMessage(user);
	}
}

