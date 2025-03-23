package org.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingCSSPropertiesOfFBUsingGetCssValue {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			WebElement createAccountButton = driver.findElement(By.linkText("Create new account"));
			
			String createAccountButtonColor = createAccountButton.getCssValue("background-color");
			
			System.out.println(createAccountButtonColor);
	}

}
