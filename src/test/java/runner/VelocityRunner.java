package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/resources/features/VelocityEcomFeatures/VelocityDashboardLoginPage.feature",
        "src/test/resources/features/VelocityEcomFeatures/VelociyEcomInventoryUpdatePage.feature"},
        glue = {"stepDefinitions","hooks"},
        plugin = {"pretty"},
        publish = true,
        dryRun = false
)
public class VelocityRunner extends AbstractTestNGCucumberTests {

}
