package com.mmtspl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.mmtspl.controller", "com.mmtspl.service"})
public class SpringBootJunit5ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJunit5ExampleApplication.class, args);
	}

}