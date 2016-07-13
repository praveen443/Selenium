package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import Utils.TestReporter;
import browserFunction.launchBrowser;

public class crossBrowserTesting {
  private WebDriver driver;
  
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() {
       TestReporter.logStep("Perform the Cross-browser testing.");
  }

  @SuppressWarnings("static-access")
  @Parameters({"browserType","appURL"})
  @Test(description="Cross-browser Testing",groups="Regression Tests")
  public void crossBrowserTest(String browserType, String appURL) {
	  
	  //Pass the parameters from xml file - browserType and appURL.
	  TestReporter.logStep("Launch the Browser and hostURL.");
	  launchBrowser launchBrowser = new launchBrowser();
	  launchBrowser.getBrowserType(driver, browserType, appURL);
  }
  
  @AfterMethod(alwaysRun=true)
  public void afterMethod(ITestResult result) {
	  TestReporter.log("Close the browser instances.");
	  if(driver!= null){
		  driver.quit();
	  }
  }

}
