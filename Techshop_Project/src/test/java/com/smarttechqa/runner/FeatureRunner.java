package com.smarttechqa.runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.smarttechqa.basepage.BaseClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/"}, //    / means folder
		glue = {"com.smarttechqa.stepdef","com.smarttechqa.hooks", "com.smarttechqa.elements"}, //feature files, and all other connecting to stepdef
		plugin = {"pretty", "json:target/cucumber.json"}, //for report
		//dryRun= true //none of feature files will execute, will run in the background only 
		// dryRun =false  //will run everything and open browser
		dryRun= true, 
		//tags = "@smoke", //will only do smoke test and ignore rest
		monochrome = true  //make console readable 
		
		)

public class FeatureRunner extends AbstractTestNGCucumberTests {
  
	@Parameters("browserType")
	@BeforeClass
	public static void beforeClass(@Optional("firefox")String browser) throws IOException {
	 BaseClass.initializeProperties();
	BaseClass.property.setProperty("BrowserType", browser);
	}
	
	@AfterClass
    public static void afterClass() {
		
	}
}
