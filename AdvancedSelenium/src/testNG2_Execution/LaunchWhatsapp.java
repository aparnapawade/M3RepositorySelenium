package testNG2_Execution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchWhatsapp {

	@Test(groups = "IT")
	  public void launchWhatsapp() 
	  {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://web.whatsapp.com/");
		 driver.close();
	  }
}
