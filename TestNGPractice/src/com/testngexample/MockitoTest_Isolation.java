package com.testngexample;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import org.mockito.Mockito;

public class MockitoTest_Isolation {

	@Test
	public void test_On_Start() {
		ITestContext mockContext = Mockito.mock(ITestContext.class);
		Mockito.when(mockContext.getName()).thenReturn("MockSuite");
		
		TestListeners listen = new TestListeners();
		listen.onStart(mockContext);
		
		Mockito.verify(mockContext).getName();
	}
}
	