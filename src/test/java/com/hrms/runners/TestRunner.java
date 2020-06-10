package com.hrms.runners;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/", // specify which feature file to run

		// in our case we do say to run all features inside features package
		glue = "com/hmrs/steps", // Where we can find implimentation code for gherkin steps|?
		// we specify just package
		dryRun =false,  // if set to true it will qukcly scan that all gherkin?
// implementation code
// if set to true no actual exeception willhappen
		monochrome = true
		,tags = "@smoke"
		
      
)

public class TestRunner {

}
