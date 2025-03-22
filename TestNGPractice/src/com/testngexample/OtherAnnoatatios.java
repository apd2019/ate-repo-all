package com.testngexample;

import java.io.File;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;



public class OtherAnnoatatios {
	
	@Test(invocationCount = 5, description = "exec 5 times")
	public void testcase1() {
		System.out.println("Testing1");
	}
	
	@Test(enabled=true)
	public void testcase2() {
		System.out.println("executing...");
	}
	
	@Test(dependsOnMethods = {"testcase2"})	
	public void testcase3() {
		System.out.println("Case 3 testing");
	}
	
	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void testcase4() {
		
		System.out.println("testing case 4");
	}
	
	@Test(expectedExceptions = FileNotFoundException.class)
	public void testcase5() {
		
		File file = new File("");
	}
}
