package com.testngexample;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListeners.class)
public class TestCaseListenerExample {
	
	@Test
	public void test_Case_success() {
		System.out.println("Executing pass testcase");
		Assert.assertTrue(true);
	}
	
	@Test
	public void testFailed() {
		System.out.println("Executing failed testcase");
		Assert.fail();
		
	}
	
	@Test
	public void test_Skipped() {
		System.out.println("Executing skip test case");
		throw new RuntimeException("skipping test");
		
	}
	
	
}
