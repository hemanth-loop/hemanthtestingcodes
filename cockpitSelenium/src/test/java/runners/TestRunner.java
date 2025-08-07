package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepdefinitions"},
        tags = "@login",
        plugin = {"pretty", "html:target/cucumber-reports.html",
                     "rerun:target/failed_scenarios.txt"},
        monochrome = true
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
