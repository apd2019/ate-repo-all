package com.testngexample;

import org.testng.annotations.Test;

public class ExecutionOrderExample {
	
	@Test(priority=0)
	public void openBrowser()
	{
		System.out.println("Open Browser");
	}
	
	@Test(priority=1)
	public void Login()
	{
		System.out.println("Login");
	}
	
	@Test(priority=2)
	public void addItemToCart()
	{
		System.out.println("Add item");
	}
	
	@Test(priority=3)
	public void placeOrder()
	{
		System.out.println("Place Order");
	}
	
	@Test // no priority - exec works based on alphabetical order
	public void AddMobile()
	{
		System.out.println("Add Mobile");
	}
}
