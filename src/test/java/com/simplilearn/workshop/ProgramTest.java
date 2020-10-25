package com.simplilearn.workshop;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ProgramTest {

	@Test
	public void testGreeting() {
		Program instance = new Program();
		//check the returned string is not null
		assertNotNull(instance.getGreeting());
	}
}
