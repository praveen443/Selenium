package alertHandler;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import Utils.Sleeper;
import testResources.ConstantInput.constants;

public class HandleAlertsAndPopUps {
  
	 public static String URL = "http://toolsqa.com/automation-practice-switch-windows/";
	 private WebDriver driver; 
	 private String testName;
	 
	 @FindBy(id="alert")
	 private WebElement btnAlertMsg;
	 
	  @BeforeMethod
	  public void beforeMethod() {
		     testName = new Object() {}.getClass().getEnclosingClass().getName();
		     System.out.println("TestCase Name: " + testName);
		  
			 System.setProperty("webdriver.chrome.driver", constants.chromeDriverPath);
			 System.out.println("Launch the Chrome browser.");
			 driver = new ChromeDriver();
			 System.out.println("Maximize the browser window.");
			 driver.manage().window().maximize();
			 driver.get(URL);
			 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  
			 //HighlightElement.highlightElement(driver, btnFirstWindow);
			 Assert.assertTrue(driver.findElement(By.id("alert")).isDisplayed(), "The 'Automation Practice Switch Windows' page is not loaded.");
			 System.out.println("The 'Automation Practice Switch Windows' page is loaded.");
	  }
	 
	  @Test
	  public void handleAlertsAndPopUps() {
		  // Click on 'New Message Window' button.
		  driver.findElement(By.id("alert")).click();
		  Sleeper.sleep(5000);
		  
			  Alert alert = driver.switchTo().alert();
			  String getAlertTitle = alert.getText();
			  System.out.println("Title of the Alert message is : " + getAlertTitle);
			  alert.accept();
			  
	  }
	  
	  @AfterMethod
	  public void afterMethod() {
		  if(driver !=null) driver.quit();
		  System.out.println("Close the driver(browser) instances.");
	  }

	}

