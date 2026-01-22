package com.CucumberRunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Featurefiles/FoundItProject.feature",
glue = {"com.stepDefinitions","com.hooks"},
monochrome = true,
dryRun = false,

publish = true,
plugin = { 
		"html:FoundItReports/FoundItHTMLReports.html",
		"json:FoundItReports/FoundItJSONReports.json",
		"pretty"
		})
public class CucumberRunnerClass {

}
