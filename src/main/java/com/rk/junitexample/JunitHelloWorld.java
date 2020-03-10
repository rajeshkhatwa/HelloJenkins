package com.rk.junitexample;

/**
 * Hello world!
 *
 */
public class JunitHelloWorld {
	public static void main(String[] args) {
		NumberCheck checkGreater = new NumberCheck(3, 4);
		System.out.println("Num1 is greater than num 2 " + checkGreater.isGreater());

	}
}
