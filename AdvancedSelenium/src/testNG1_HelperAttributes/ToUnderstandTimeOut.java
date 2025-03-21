package testNG1_HelperAttributes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToUnderstandTimeOut {
	
	//timeOut -- is a helper attribute
	//timeOut will accept time in long format-- that is in millis
	//If test case not gets completely execute in given timeOut time-- will gets failed - throws ThreadTimeOutException

	//For this method -- within given 10 seconds --the test case should gets execute within given time
	//If not gets completely execute in given timeOut time-- will gets failed - throws ThreadTimeOutException
  @Test(timeOut = 10000)
  public void launchSelenium() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.selenium.dev/");
	  driver.close();
  }
}
