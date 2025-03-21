package testNG7_Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUnderstandAssert_HardAssert {
  
  @Test
  public void invalidLoginTC() {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://demowebshop.tricentis.com/");
	 
	 String expectedTitleOfWelcomePage = "Demo Web Shop";  
	 String expectedTitleOfLoginPage = "Demo Web Shop. Login ";
	//If title will not match will get error and execution will stop- will not go to next steps
	 Assert.assertEquals(driver.getTitle(), expectedTitleOfWelcomePage, "Welcome page is not found!!"); 
	 	 	 
	 driver.findElement(By.linkText("Log in")).click();
	//Assert.assertEquals(driver.getTitle(), expectedTitleOfLoginPage, "Login page is not found!!");
	 Assert.assertTrue(driver.getTitle().equals(expectedTitleOfLoginPage), "Login page is not found!!");
	 driver.findElement(By.id("Email")).sendKeys("swamisamarth@yahoo.com");
	 driver.findElement(By.id("Password")).sendKeys("12345!@");
	 driver.findElement(By.cssSelector("input[value='Log in']")).submit();
	 
	 }
}

