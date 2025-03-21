package testNG6_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithDataProvider {
	
	@DataProvider(name = "logincredentials")
	public String[][] dataProviderMethod()
	{	
		String[][] arr = {
				{"admin123@gmail.com", "12345"},
				{"  wert@.com", "#$"},
				{"  @yahoo.com", "  "}
		};
		return arr;	
	}
	
	
  @Test(dataProvider = "logincredentials", dataProviderClass = testNG6_DataProvider.LoginWithDataProvider.class)
  public void invalidLoginTC(String email, String password) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://demowebshop.tricentis.com/");
	 driver.findElement(By.linkText("Log in")).click();
	 driver.findElement(By.id("Email")).sendKeys(email);
	 driver.findElement(By.id("Password")).sendKeys(password);
	 driver.findElement(By.cssSelector("input[value='Log in']")).submit();
  }
}
