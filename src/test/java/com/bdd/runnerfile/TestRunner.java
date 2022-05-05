package com.bdd.runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Karen Amy\\eclipse-workspace\\Feb_BDDFramework\\src\\test\\java\\com\\bdd\\featurefile",
				glue ="com.bdd.stepdefinition",
				plugin= {"pretty","html:TestOutput/CucumberReports"},
				tags= {"@Alert"},
				dryRun=true,// to check the unimplemented steps in feature file before the execution
				monochrome=true) //display console information in readable format
public class TestRunner {

}
