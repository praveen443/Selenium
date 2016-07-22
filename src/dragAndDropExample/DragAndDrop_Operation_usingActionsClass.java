package dragAndDropExample;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import browserFunction.launchBrowser;
import Utils.TestReporter;

public class DragAndDrop_Operation_usingActionsClass {
  private WebDriver driver;
  private String testName;
  private WebElement Sourcelocator = driver.findElement(By.cssSelector(".ui-draggable"));
  private WebElement Destinationlocator = driver.findElement(By.cssSelector(".ui-droppable"));
  
  /**
   * @description: Used @BeforTest annotation to print the test name 
   * before starting the test-script execution.
   */
  @BeforeTest()
  public void beforeTest() {
	   //To get the testMethod as testName.
	   testName = new Object(){}.getClass().getEnclosingMethod().getName();
	   TestReporter.log("Started the test -- " + testName);
  }

  /**
   * @description: Used @Test annotation method to perform the business logic.
   * Parameters are passed using xml file configuration like browser name and app URL etc.,.
   * @param browserType, @param appURL
   */
  @SuppressWarnings("static-access")
  @Parameters({"browserType","appURL"})
  @Test(description="Drag and Drop operation Uisng Actions Class in WebDriver",
        groups="Regression Tests")
  public void dragAndDrop_UisngActionsClass(String browserType, String appURL) {
	  
		 //Pass the parameters from xml file - browserType and appURL.
		 TestReporter.logStep("Launch the Browser and hostURL.");
		 launchBrowser launchBrowser = new launchBrowser();
		 launchBrowser.getBrowserType(driver, browserType, appURL);
		  
		 //Wait for the frame to be available and switch to it
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		 
		 //Perform the drag and drop opeartion using actions class in webdriver
		 TestReporter.log("Perform the drag and drop opeartion using actions class in webdriver.");
		 dragAndDrop(Sourcelocator,Destinationlocator);
		 
		 //Verify the text after dropping the source locator to its destination.
		 TestReporter.log("Verify the text after dropping the source locator to its destination.");
		 String actualText=driver.findElement(By.cssSelector("#droppable>p")).getText();
		 TestReporter.assertEquals(actualText, "Dropped!", "Actual string value is - "+ actualText + " & " + " Expected string value is - "+ actualText+" ");
  }
  
  /**
   * @description: Used @AfterTest annotation.. to close the drivers 
   * instances after the test execution is completed.
   */
  @AfterTest()
  public void afterTest() {
	  if(driver!=null){
		  driver.quit();
	  }
	  
  }

  /**
   * @summary: Method to perform the drag and drop operation using actions class in webdriver
   * @author: Praveen varma Namburi
   * @param Sourcelocator, @param Destinationlocator
   */
  public void dragAndDrop(WebElement Sourcelocator, WebElement Destinationlocator){
	  try {
			  if(Sourcelocator.isDisplayed() && Destinationlocator.isDisplayed()){
				  Actions actions = new Actions(driver);
				  actions.dragAndDrop(Sourcelocator, Destinationlocator).build().perform();
			  }else{
				  System.out.println("Element was not displayed to drag");
			  }
			
	  } catch (NoSuchElementException e) {
		System.out.println("Element " + Sourcelocator + "or" + Destinationlocator + " was not found in DOM "+ e.getStackTrace());
      }
  
  }
  
}
