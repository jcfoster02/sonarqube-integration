package com.simplilearn.workshop;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdditionTest {
	@Test
	public void testAdd() {
		Program instance = new Program();
		assertEquals(10, instance.add(5, 5));
	}

}
