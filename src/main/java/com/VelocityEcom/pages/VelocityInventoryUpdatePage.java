package com.VelocityEcom.pages;

import com.VelocityEcom.driverFactory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VelocityInventoryUpdatePage {
    @FindBy (xpath = "//a[text()='Inventory Update']")
    private WebElement inventoryUpdateButton;
    @FindBy (xpath = "(//div[@class='stat-value'])[1]")
    private WebElement totalEntriesField;
    @FindBy (xpath = "(//div[@class='stat-value'])[2]")
    private WebElement openPartialField;
    @FindBy (xpath = "(//div[@class='stat-value'])[3]")
    private WebElement fullyReceaivedField;
    @FindBy (xpath = "(//div[@class='stat-value'])[4]")
    private WebElement unitsOrderedField;
    @FindBy (xpath = "(//div[@class='stat-value'])[5]")
    private WebElement totalStockField;

    public VelocityInventoryUpdatePage(){
        PageFactory.initElements(DriverFactory.getDriver(),this);
    }

    public void clickingInventoryUpdateButton(){
        inventoryUpdateButton.click();
    }
    public String getTotalEntriesField(){
       return totalEntriesField.getText();
    }
    public String getOpenPartialField(){
        return openPartialField.getText();
    }
    public String getFullyReceaivedField(){
        return fullyReceaivedField.getText();
    }
    public String getUnitsOrderedField(){
        return unitsOrderedField.getText();
    }
    public String getTotalStockField(){
        return totalStockField.getText();
    }


}
