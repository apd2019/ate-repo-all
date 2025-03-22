package com.testngexample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotationExample {

	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("BeforeSuite method");
	}

	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("BeforeTest method");
	}
	
	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("beforeClass method");
	}

	@BeforeMethod
	public void runBeforeMethod() {
		System.out.println("Run before method");
	}

	@Test
	public void testCase1() {
		System.out.println("executing test case 1");
	}

	@AfterMethod
	public void runAfterMethod() {
		System.out.println("Run after method");
	}

	@AfterClass
	public void afterClassMethod() {
		System.out.println("After class method");
	}

	@AfterTest
	public void AfterTestMethod() {
		System.out.println("After test method");
	}

	@AfterSuite
	public void AfterSuiteMethod() {
		System.out.println("After Suite method");
	}
}
