package org.popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleChildWindowPopupInSBILogin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		String expectedURL = "https://retail.onlinesbi.sbi/retail/troubleloginhome.htm?bankCode=0";
		for(String windowId : allWindowIds)
		{
			driver.switchTo().window(windowId);
			String actualURL = driver.getCurrentUrl();
			if(actualURL.equalsIgnoreCase(expectedURL))
			{
				break;
			}
		}
		driver.findElement(By.id("nextStep")).click();
		driver.findElement(By.id("userName")).sendKeys("Aparna");
		driver.findElement(By.id("accountNo")).sendKeys("12345");
		WebElement countryDropdown = driver.findElement(By.id("selCountry"));
		Select select = new Select(countryDropdown);
		select.selectByVisibleText("India");
		driver.findElement(By.id("mobileNo")).sendKeys("1234567890");
		driver.findElement(By.id("datepicker5")).sendKeys("02/02/2020");
		driver.findElement(By.id("loginCaptchaValue")).sendKeys("en28f");
		driver.findElement(By.id("go")).click();
	
	}

}
