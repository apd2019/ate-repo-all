package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/main/java/features/SimplilearnTest.feature", 
		glue = "stepDefinitions", 
//		tags = "@SmokeTest or @RegressionTest",
		plugin = { 
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} 
		)


public class TestRunner extends AbstractTestNGCucumberTests{
	
}
