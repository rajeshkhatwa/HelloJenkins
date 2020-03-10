package com.rk.junitexample;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class JunitHelloWorldTest {

	@Test
	public void isGreaterTest() {
		NumberCheck JunitTest = new NumberCheck(5, 3);
		assertTrue(JunitTest.isGreater(), "Num1 is greater than num2 ");
		System.out.println("I am test");
	}

}
