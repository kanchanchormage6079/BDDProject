package study.stepDefinations;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.testng.Reporter;

import java.util.List;
import java.util.Map;

public class VelocityEcomLoginAdmin {
    @Given("user is on Ecom login page")
    public void user_is_on_ecom_login_page() {
        Reporter.log("user is on Ecom login page",true);
    }

    @When("user click on admin button")
    public void user_click_on_admin_button() {
        Reporter.log("user click on admin button",true);
    }

    @When("user enters username as {string}")
    public void user_enters_username_as(String username) {
        Reporter.log("user enters username",true);
    }

    @When("user enters password as {string}")
    public void user_enters_password_as(String password) {
        Reporter.log("user enters password",true);
    }

    @When("user click on access dashboard button")
    public void user_click_on_access_dashboard_button() {
        Reporter.log("user click on access dashboard button",true);
    }

    @Then("user navigate to dashboard page")
    public void user_navigate_to_dashboard_page() {
        Reporter.log("user navigate to dashboard page",true);
    }

    @And("user enters username as a {string}")
    public void userEntersUsernameAsA(String username) {
        Reporter.log("user enters username",true);
    }

    @And("user enters password as a {string}")
    public void userEntersPasswordAsA(String password) {
        Reporter.log("user enters password",true);
    }

    @When("user enters registration details & click on admin button")
    public void user_enters_registration_details_click_on_admin_button(io.cucumber.datatable.DataTable dataTable) {
//        List<List<String>> users = dataTable.asLists();
//        System.out.println(users);
//        String firstName = users.get(1).get(0);
//        Reporter.log("Firstname is "+firstName,true);
//        Reporter.log("Lastname is "+users.get(1).get(1),true);
//        Reporter.log("EmailID is "+users.get(1).get(2),true);
//        Reporter.log("lastname of user2 is "+users.get(2).get(1),true);
          List<Map<String, String>> users = dataTable.asMaps();
          System.out.println(users);
          String firstname = users.get(2).get("Firstname");
          Reporter.log("FirstName is "+firstname,true);
          Reporter.log("LastName is "+users.get(2).get("Lastname"),true);
          Reporter.log("Email Id is "+users.get(2).get("EmailId"),true);
          Reporter.log("Header is "+users.get(0).keySet(),true);
          Reporter.log("Data are "+users.get(0).values(),true);

    }
}
