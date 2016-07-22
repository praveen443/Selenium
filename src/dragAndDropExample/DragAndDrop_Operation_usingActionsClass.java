package dragAndDropExample;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import browserFunction.launchBrowser;
import Utils.TestReporter;

public class DragAndDrop_Operation_usingActionsClass {
  private WebDriver driver;
  private String testName;
  
  /**
   * @description: Used @BeforTest annotation to print the test name 
   * before starting the test-script execution.
   */
  @BeforeTest(alwaysRun=true)
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
        groups="Regression Tests",priority=1,enabled=true)
  public void dragAndDrop_UisngActionsClass(String browserType, String appURL) {
	  
	  //Pass the parameters from xml file - browserType and appURL.
	  TestReporter.logStep("Launch the Browser and hostURL.");
	  launchBrowser launchBrowser = new launchBrowser();
	  launchBrowser.getBrowserType(driver, browserType, appURL);
  }
  
  /**
   * @description: Used @AfterTest annotation.. to close the drivers 
   * instances after the test execution is completed.
   */
  @AfterTest(alwaysRun=true)
  public void afterTest() {
	  if(driver!=null){
		  driver.quit();
	  }
	  
  }

}
