package com.mmtspl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.mmtspl.service.SpringBootJunit5ExampleService;

/*
 * JUnit 5 test for Spring Boot Component
 */

@SpringBootTest
public class SpringBootJunit5ExampleServiceTest {

	@Autowired
	private SpringBootJunit5ExampleService messageService;
	
	 @Test
	 @DisplayName("Subscription message service test ")
	 void testSubscriptionMessage() {
		 
		String user = "Peter";
		 
	    String message = messageService.getSubscriptionMessage(user);
	    assertEquals("Hello "+user+", Thanks for the subscription!", message);
	 }
}