package study.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.testng.Reporter;

public class Hooks_Study {
    @Before (order = 1)
    public void setUpBrowser(){
        Reporter.log("Set Up Crome Browser",true);
    }
    @After (order = 1)
    public void tearDown(){
        Reporter.log("Closing Browser",true);
    }

    @Before (order = 2)
    public void launchApplication(){
        Reporter.log("Launch the Application",true);
    }
    @After (order = 2)
    public void logOut(){
        Reporter.log("LogOut user",true);
    }

    @Before (order = 3)
    public void abc(){
        Reporter.log("abc mathod Running",true);
    }
    @After (order = 3)
    public void cba(){
        Reporter.log("cba method running",true);
    }

    @BeforeStep
    public void demo(){
        Reporter.log("Before step method Running",true);
    }
    @AfterStep
    public void test(){
        Reporter.log("After step method Running",true);
    }

}
