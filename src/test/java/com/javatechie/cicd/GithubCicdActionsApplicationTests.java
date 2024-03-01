package com.javatechie.cicd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GithubCicdActionsApplicationTests {

	@Test
	void test1(){
		var calculator = new SimpleCalculator();
		assertEquals(4, calculator.add(2, 2));
	}

}
