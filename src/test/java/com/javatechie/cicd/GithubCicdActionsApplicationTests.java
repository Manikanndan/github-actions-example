package com.javatechie.cicd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GithubCicdActionsApplicationTests {

	String message = "World!...";
	
	@Test 
	void test1() {
	System.out.println("Inside testMessage()");
	assertEquals(message, "Hello World!...");
	}

	@Test
	void test2(){
		GithubCicdActionsApplication calculator = new GithubCicdActionsApplication();
		assertEquals(3, calculator.add(2, 2));
	}

}
