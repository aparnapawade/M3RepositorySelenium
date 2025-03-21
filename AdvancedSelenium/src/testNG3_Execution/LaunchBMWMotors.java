package testNG3_Execution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBMWMotors {
	
  @Test(groups = "FT")
  public void launchBMWMotors()
  {
	  WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://www.bmw-motorrad.in/");
		 driver.close();
  }
}
