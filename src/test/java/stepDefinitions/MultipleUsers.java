package stepDefinitions;

import com.VelocityEcom.pages.VelocityDashboardLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Reporter;

public class MultipleUsers {
    VelocityDashboardLoginPage velocity = new VelocityDashboardLoginPage();
    @When("user enter username {string}")
    public void userEnterUsername(String username) {
        velocity.enterUsername(username);
    }

    @And("user enter password {string}")
    public void userEnterPassword(String password) {
        velocity.enterPassword(password);
        velocity.clickOnAccessDashboardButton();
        Reporter.log("user enters invalid credentials",true);
    }
}
