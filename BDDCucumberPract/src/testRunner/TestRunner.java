package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

/*@CucumberOptions(

		features = "src/feature/HookExample.feature", 
		glue = "stepDefinitions", 
		plugin = { "pretty",
				"html:target/cucumber-html-report.html",
				 "json:target/cucumber-json-report.json", "junit:target/cucumber-xml-report.xml" } 
		)*/

/*@CucumberOptions(

		features = "src/feature/TagExample.feature", 
		glue = "stepDefinitions", 
		tags = "@SmokeTest",
		plugin = { "pretty",
				"html:target/cucumber-html-report.html",
				 "json:target/cucumber-json-report.json", "junit:target/cucumber-xml-report.xml" } )*/

//Tags Example
//Not not @SmokeTest"
//tags  @SmokeTest" and @ChromeBrowser
//tags @SmokeTest or @RegressionTest

@CucumberOptions(

		features = "src/feature/TagExample.feature", 
		glue = "stepDefinitions", 
		tags = "@SmokeTest or @RegressionTest",
		plugin = { "pretty",
				"html:target/cucumber-html-report.html",
				 "json:target/cucumber-json-report.json", "junit:target/cucumber-xml-report.xml" } )

public class TestRunner {

}
		