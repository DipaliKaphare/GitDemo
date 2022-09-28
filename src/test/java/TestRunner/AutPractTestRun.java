package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
	@RunWith(Cucumber.class)
	@CucumberOptions(
	features = "AutPract" ,
	glue = {"AutPractStep"},
//	tags = {@p2},
	monochrome=true
	)
	
	public class AutPractTestRun {
	
	
}
