package com.javatechie.cicd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GithubCicdActionsApplicationTests {

	@Test
	void test1(){
        System.out.println("Executing Addition Test");
        assert 3 == MathsClass.add(1,2);
    }

    @Test
    void test2(){
        System.out.println("Executing Multi[lication] Test");
        assert 12 == MathsClass.multiply(6,2);
    }

}
