package testNG1_HelperAttributes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToUnderstandThreadPoolSize {
	
	//threadPoolSize - is a Helper attribute
	//It is used to execute the testcase (method) multiple times parallely.
	//By default threadPoolSize will be 1
	//threadPoolSize will accept integer, normally we will give it similar to invocationCount to run testcase same times parallely.
	//Don't use threadPoolSize -- without invocationCount
	
	//This method will be invoked 5 times-- at a time in 3 browser and later once is done will execute again 2 times
  @Test(invocationCount = 5 ,threadPoolSize = 3)
  public void launchSelenium() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.selenium.dev/");
	  driver.close();
  }
}
