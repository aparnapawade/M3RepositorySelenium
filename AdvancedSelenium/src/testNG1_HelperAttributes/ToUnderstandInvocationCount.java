package testNG1_HelperAttributes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToUnderstandInvocationCount {
	
	//invocationCount -- is a Helper Attribute
	//It is used when we want to execute same method multiple times
	//We can pass count in the form of integer--that much time the method will get execute
	//invocation count should be equal to or greater than 0 -- that is it will be always positive
	//By default the invocation count will be 1 --and executes the method once
	
  @Test(invocationCount = 2) // will be invoked 2 times
  public void launchSelenium() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.selenium.dev/");
	  driver.close();
  }
  
  @Test(invocationCount = 0)  //will not be invoked
  public void launchJavaPoint()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.tpointtech.com/");
  }
}
