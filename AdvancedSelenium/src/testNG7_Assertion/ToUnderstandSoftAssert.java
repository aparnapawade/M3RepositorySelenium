package testNG7_Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUnderstandSoftAssert {
	
	//SoftAssert is a class --which contains non-static methods
	//It will not stop execution
	//Mandatory to call assert() method at last-- so it can gives us failure message and result
	//If not using assertAll() at last --it will show result as passed and will not display failure message --even if validation not matches
	
	@Test
	  public void invalidLoginTC() {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 String expectedTitleOfWelcomePage = "Demo Web Shop  ";  //adding space so title should not get match
		 String expectedTitleOfLoginPage = "Demo Web Shop. Login  ";
		 
	//If title will not matched  --execution will not get stop- will execute next login -next steps 
	//At last of script need to use assertAll() --so that it can execute script but in result will show as failed and failed messages
		 SoftAssert softassert = new SoftAssert();
		 softassert.assertEquals(driver.getTitle(), expectedTitleOfWelcomePage, "Welcome Page is not found!!");
		 
		 driver.findElement(By.linkText("Log in")).click();
		 softassert.assertEquals(driver.getTitle(), expectedTitleOfLoginPage, "Login Page is not found!!");
		 driver.findElement(By.id("Email")).sendKeys("swamisamarth@yahoo.com");
		 driver.findElement(By.id("Password")).sendKeys("12345!@");
		 driver.findElement(By.cssSelector("input[value='Log in']")).submit();
		 
		 softassert.assertAll();
		 }
}
