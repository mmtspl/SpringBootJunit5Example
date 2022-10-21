package com.mmtspl.service;

import org.springframework.stereotype.Component;

@Component
public class SpringBootJunit5ExampleService {
	
	public String getSubscriptionMessage(String user) {
		
		return "Hello "+user+", Thanks for the subscription!";
	}
}