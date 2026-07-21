package stepDefinitions;

import com.VelocityEcom.pages.VelocityDashboardLoginPage;
import com.VelocityEcom.pages.VelocityDashboardValidationPage;
import com.VelocityEcom.pages.VelocityInventoryUpdatePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class StepDefinitions {
    VelocityDashboardLoginPage velocity = new VelocityDashboardLoginPage();
    VelocityDashboardValidationPage validation = new VelocityDashboardValidationPage();
    SoftAssert softAssert = new SoftAssert();
    VelocityInventoryUpdatePage velocityInventoryUpdatePage = new VelocityInventoryUpdatePage();

    @Given("user is on Ecom login page")
    public void user_is_on_ecom_login_page() {
        Reporter.log("User is on Ecom login page", true);
    }

    @When("user click on Admin Button")
    public void user_click_on_admin_button() {
     velocity.clickOnAdminButton();
    }

    @When("user enters username {string}")
    public void user_enters_username(String name) {
     velocity.enterUsername(name);
    }

    @When("user enters password {string}")
    public void user_enters_password(String pass) {
      velocity.enterPassword(pass);
    }

    @When("user click on Access Dashboard Button")
    public void user_click_on_access_dashboard_button() {
        velocity.clickOnAccessDashboardButton();
        Reporter.log("user click access button",true);
    }

    @Then("user should be on Dashboard page")
    public void user_should_be_on_dashboard_page() throws InterruptedException {
        Thread.sleep(4000);
        //Assert.fail();
        Reporter.log("User navigates to Velocity Ecom Dashboard page",true);
        String totalProducts = validation.setTotalProducts();
        Reporter.log(totalProducts,true);
        softAssert.assertNotNull(totalProducts,"Total products are null, TC fail");

        String totalOrders=validation.setTotalOrders();
        Reporter.log(totalOrders,true);
        softAssert.assertNotNull(totalOrders,"Total oredrs are is null, TC fails");

        String lowStock=validation.setLowStoclItems();
        Reporter.log(lowStock,true);
        softAssert.assertNotNull(lowStock,"Low stock is Not null, TC fails");

        String pendingApproval=validation.setPendingApproval();
        Reporter.log(pendingApproval,true);
        softAssert.assertNotNull(pendingApproval,"Pending approval is null, TC fails");

        String totalRevenue=validation.setTotalRevenue();
        Reporter.log(totalRevenue,true);
        softAssert.assertNotNull(totalRevenue,"Total revenue is Not null, TC fails");
        softAssert.assertAll();
    }

    @And("user click on inventory update button")
    public void userClickOnInventoryUpdateButton() throws InterruptedException {
        Thread.sleep(5000);
         velocityInventoryUpdatePage.clickingInventoryUpdateButton();
         Reporter.log("Cliking on Inventory update button",true);
    }

    @And("user validates all KPI cards details present on inventory update page")
    public void userValidatesAllKPICardsDetailsPresentOnInventoryUpdatePage() throws InterruptedException {
        Thread.sleep(5000);

        Reporter.log("Total entries are "+velocityInventoryUpdatePage.getTotalEntriesField(),true);
        Reporter.log("Open/Partial value are "+velocityInventoryUpdatePage.getOpenPartialField(),true);
        Reporter.log("Fully received orders are "+velocityInventoryUpdatePage.getFullyReceaivedField(),true);
        Reporter.log("Units ordered are "+velocityInventoryUpdatePage.getUnitsOrderedField(),true);
        Reporter.log("Total stock are "+velocityInventoryUpdatePage.getTotalStockField(),true);
        String expectedFullyReceivedOrders = "39";
        Assert.assertEquals(velocityInventoryUpdatePage.getFullyReceaivedField(),
                expectedFullyReceivedOrders,"Actual & expected values are not equals, TC failed");

    }
}
