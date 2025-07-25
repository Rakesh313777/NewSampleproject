package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "features" }, // features/login.feature and comment the tags
                glue = { "stepDefinations" }, plugin = { "pretty", "html:target/cucumber-reports",
                                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                                "rerun:target/failedrerun.txt" }, tags = "@signup1", monochrome = true)
public class RunnerClass extends AbstractTestNGCucumberTests {

}
