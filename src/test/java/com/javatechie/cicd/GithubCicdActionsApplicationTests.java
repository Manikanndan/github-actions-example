package com.javatechie.cicd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GithubCicdActionsApplicationTests {

	@Test
	void test1(){
		var calculator = new SimpleCalculator();
		assertEquals(expected:4, calculator.add(numberA:2, numberB:2));
	}

}
