package com.VelocityEcom.pages;

import com.VelocityEcom.driverFactory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VelocityDashboardValidationPage {
   @FindBy (xpath = "//div[@class='admin-stat-card success']")
    private WebElement totalProducts;
   @FindBy (xpath = "(//div[@class='admin-stat-card'])[1]")
    private WebElement totalOrders;
   @FindBy (xpath = "//div[@class='admin-stat-card warning']")
    private WebElement lowStoclItems;
   @FindBy (xpath = "//div[@class='admin-stat-card danger']")
    private WebElement pendingApproval;
   @FindBy (xpath = "(//div[@class='admin-stat-card'])[2]")
    private WebElement totalRevenue;

   public VelocityDashboardValidationPage(){
       PageFactory.initElements(DriverFactory.getDriver(),this);
   }

   public String setTotalProducts(){
       return totalProducts.getText();
   }

   public String setTotalOrders(){
        return totalOrders.getText();
   }

   public String setLowStoclItems(){
        return lowStoclItems.getText();
   }

   public String setPendingApproval(){
        return pendingApproval.getText();
   }

   public String setTotalRevenue(){
        return totalRevenue.getText();
   }
}
