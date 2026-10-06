package com.bhanu.www.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	@Test
	void addsTwoNumbers() {
		assertEquals(5, new Calculator().add(2, 3));
	}
}