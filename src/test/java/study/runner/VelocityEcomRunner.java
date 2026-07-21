package study.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/VelocityEcomLoginAdmin.feature"},
        glue = {"study/stepDefinations", "study"},
        publish = true,
        plugin = {"pretty"},
        tags = "@Functional and @Smoke or @Regression or @Retesting",
        dryRun = false

)
public class VelocityEcomRunner extends AbstractTestNGCucumberTests {
}
