package com.testngexample;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups = {"SmokeTest", "RegressionTest"})
	public void openBrowser()
	{
		System.out.println("Open Browser");
	}
	
	@Test(groups = {"SmokeTest", "RegressionTest"})
	public void Login()
	{
		System.out.println("Login");
	}
	
	@Test(groups = {"SmokeTest", "RegressionTest"})
	public void addItemToCart()
	{
		System.out.println("Add item");
	}
	
	@Test(groups = {"SmokeTest"})
	public void placeOrder()
	{
		System.out.println("Place Order");
	}
	
	@Test (groups = {"RegressionTest"})
	public void AddMobile()
	{
		System.out.println("Add Mobile");
	}
}	
