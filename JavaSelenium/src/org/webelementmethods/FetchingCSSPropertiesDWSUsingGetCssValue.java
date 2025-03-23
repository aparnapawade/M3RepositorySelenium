package org.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingCSSPropertiesDWSUsingGetCssValue {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("Aparna", Keys.ENTER);
		
		WebElement errorMsg = driver.findElement(By.xpath("//span[contains(text(), 'enter a valid email')]"));
		
		String errorMsgColor = errorMsg.getCssValue("color");
		
		System.out.println(errorMsgColor);
	}

}
