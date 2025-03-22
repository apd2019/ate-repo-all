package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/feature/TagExample.feature", 
		glue = "stepDefinitions", 
		tags = "@SmokeTest or @RegressionTest",
		plugin = { "pretty",
				"html:target/cucumber-html-report.html",
				 "json:target/cucumber-json-report.json", "junit:target/cucumber-xml-report.xml" } )

public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
