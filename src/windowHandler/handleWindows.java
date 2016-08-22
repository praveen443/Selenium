package windowHandler;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.*;

import testResources.ConstantInput.*;

public class handleWindows {
 
 public static String URL = "http://toolsqa.com/automation-practice-switch-windows/";
 private WebDriver driver;
 private String testName;
 
 @FindBy(xpath="//button[@onclick='newMsgWin()']")
 private WebElement btnFirstWindow;
 
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
		 Assert.assertTrue(driver.findElement(By.xpath("//button[@onclick='newMsgWin()']")).isDisplayed(), "The 'Automation Practice Switch Windows' page is not loaded.");
		 System.out.println("The 'Automation Practice Switch Windows' page is loaded.");
  }
 
  @Test
  public void windowsHandling() {
	  // Click on 'New Message Window' button.
	  driver.findElement(By.xpath("//button[@onclick='newMsgWin()']")).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  // Get the current window/parent window handle.
	  String getParentWinHandle = driver.getWindowHandle();
	  System.out.println("Title of the parent window is : "+getParentWinHandle);
	  
	  Set allWindowHandles = driver.getWindowHandles();
	  System.out.println("Store and print all the open windows : "+allWindowHandles);
	  
	  
	  //A collection that contains no duplicate elements. 
	  Set<String> allWindows = driver.getWindowHandles();
	  // Pass a window handle to the other window
	  for(String handle1 : allWindows){
		  System.out.println(handle1);
		  driver.switchTo().window(handle1);
		  
		  //close the pop-up window
		  driver.close();
		  break;
		  /*String getWindowTilte = driver.getTitle();
		  System.out.println("Title of the window after switchinf from cparent window to child window : " + getWindowTilte);*/
		  
	  }
	  
  }
  
  @AfterMethod
  public void afterMethod() {
	  if(driver !=null) driver.quit();
	  System.out.println("Close the driver(browser) instances.");
  }

}
