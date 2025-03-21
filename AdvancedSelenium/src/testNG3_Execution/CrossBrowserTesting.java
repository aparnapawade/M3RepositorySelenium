package testNG3_Execution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	@Parameters("browserName")
	@Test
  public void learnParameterization(@Optional("chrome") String browser) 
  {
	  WebDriver driver = null;
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  driver = new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("edge"))
	  {
		  driver = new EdgeDriver();
	  }	  else if(browser.equalsIgnoreCase("firefox"))
	  {
		  driver = new FirefoxDriver();
	  }
	  else
	  {
		  System.err.println("Invalid browser name, Please enter valid browser name");
	  }
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://demowebshop.tricentis.com/");
  }
}
