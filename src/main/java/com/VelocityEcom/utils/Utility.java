package com.VelocityEcom.utils;

import com.VelocityEcom.driverFactory.DriverFactory;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
   public static String readDataFromPropertiesFile(String key) throws IOException {
       FileInputStream fileInputStream = new FileInputStream("C:\\Users\\vaibhav\\IdeaProjects\\24JanFrameworkProject\\src\\main\\resources\\config.properties");
       Properties obj = new Properties();
       obj.load(fileInputStream);
       String value = obj.getProperty(key);
       System.out.println("Read Data from properties file "+ key);
       return value;
   }

   public static String readDataFromExcelSheet(int row, int cell) throws IOException {
       FileInputStream myFile = new FileInputStream("C:\\Users\\vaibhav\\OneDrive\\kanchan.xlsx");
       String data = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
       System.out.println("Read data from excel sheet " + row + cell);
       return data;
   }

   public static void scrollToElement(WebElement element){
       Actions actions = new Actions(DriverFactory.getDriver());
       actions.scrollToElement(element).perform();
       System.out.println("Scroll To Element done");
   }
}
