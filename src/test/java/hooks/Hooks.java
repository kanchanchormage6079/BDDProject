package hooks;

import com.VelocityEcom.driverFactory.DriverFactory;
import com.VelocityEcom.utils.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import java.io.IOException;

public class Hooks {
    @Before
    public static void launchApplication() throws IOException {
        DriverFactory.defineBrowser(Utility.readDataFromPropertiesFile("browser"));
    }

    @After (order = 1)
    public static void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        DriverFactory.getDriver().quit();
        System.out.println("Closing the browser");
    }

    @After (order = 2)
    public static void takesScreenshot(Scenario scenario) throws InterruptedException {
        if(scenario.isFailed()) {
            Thread.sleep(5000);
            byte[] sc = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sc, "image/png", scenario.getName());
            Reporter.log("Screenshot is Captured.", true);
        }
    }
}
