package com.VelocityEcom.pages;

import com.VelocityEcom.driverFactory.DriverFactory;
import com.VelocityEcom.utils.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VelocityDashboardLoginPage {
    @FindBy (id = "tab-admin")
    private WebElement adminButton;
    @FindBy (id = "admin-username")
    private WebElement userName;
    @FindBy (id = "admin-password")
    private WebElement passWord;
    @FindBy (id = "btn-admin-signin")
    private WebElement accessDasboardButton;

    public VelocityDashboardLoginPage(){
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public void clickOnAdminButton(){
      adminButton.click();
      System.out.println("Clicking on Velocity Ecom Admin Button");
    }
    public void enterUsername(String name){
        userName.sendKeys(name);
        System.out.println("Entering username");
    }
    public void enterPassword(String pass){
        passWord.sendKeys(pass);
        System.out.println("Entering password");
    }
    public void clickOnAccessDashboardButton(){
        Utility.scrollToElement(accessDasboardButton);
        accessDasboardButton.click();
        System.out.println("Clicking on Access Dashboard Button");
    }
}


