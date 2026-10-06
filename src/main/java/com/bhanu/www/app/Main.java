package com.bhanu.www.app;

import com.bhanu.www.service.Calculator;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = calculator.add(2, 3);
		System.out.println("Result: " + result);
		System.out.println("Github workflow  demo");
	}
}