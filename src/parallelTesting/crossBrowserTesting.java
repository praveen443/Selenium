package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import Utils.TestReporter;
import browserFunction.launchBrowser;

public class crossBrowserTesting {
  private WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
       
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
  
  @AfterMethod
  public void afterMethod() {
	  if(driver!= null){
		  driver.quit();
	  }
  }

}
