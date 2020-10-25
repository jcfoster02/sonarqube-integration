package com.simplilearn.workshop;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		Calculator instance = new Calculator();
		assertEquals(10, instance.multiply(5, 2));
	}


}
