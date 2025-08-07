package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "@target/failed_scenarios.txt",  // 👉 rerun from failed scenarios
        glue = {"stepdefinitions"},
        plugin = {
                "pretty",
                "html:target/rerun-report.html"
        },
        monochrome = true
)
public class FailedTestRunner extends AbstractTestNGCucumberTests {
}
