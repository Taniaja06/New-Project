package com.my.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//plugin = "", // generate reports
		features = ".//Features/", //feature folder location
		glue = "step.definitions", // stepdef location 
		tags = "@Smoke") // specify the test case to execute
		
public class MyRunner extends AbstractTestNGCucumberTests {

}
