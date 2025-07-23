package stepDefinations;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "@target/failedrerun.txt" }, glue = { "stepDefinations" }, plugin = { "pretty",
        "html:target/cucumber-reports",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "rerun:target/failedrerun.txt" }, tags = "@login1", monochrome = true)
public class failedrerun extends AbstractTestNGCucumberTests {

}
