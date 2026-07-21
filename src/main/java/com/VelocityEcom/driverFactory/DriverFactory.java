package com.VelocityEcom.driverFactory;

import com.VelocityEcom.utils.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;
import java.time.Duration;

public class DriverFactory {
     static WebDriver driver;
   public static void defineBrowser(String browser) throws IOException {
       if(browser.equals("chrome")){
           driver = new ChromeDriver();
           System.out.println("Chrome browser open.");
       }
       else if (browser.equals("edge")) {
           driver = new EdgeDriver();
           System.out.println("Edge browser open.");
       }
       else if (browser.equals("firefox")) {
           driver = new FirefoxDriver();
           System.out.println("Firefox browser open.");
       }
       else {
           driver = new SafariDriver();
           System.out.println("Safari browser open.");
       }
       System.out.println("Define browser as "+browser);
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.get(Utility.readDataFromPropertiesFile("url"));
   }


   public static WebDriver getDriver(){
       return driver;
   }
}
