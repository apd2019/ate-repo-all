package com.datadrivenexamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClassEx {

	@DataProvider
	public static Object [] [] 	datamethod(){
		 return new Object [] [] {
			 {10}, {20}, {30}
		 };
		
	}
	
	@Test(dataProvider = "datamethod")
	public void sampleTest(Object data)
	{
		System.out.println(data);
	}
}
