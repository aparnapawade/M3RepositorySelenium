package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingLoginButtonOfFacebookUsingNameLocator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Aparna@gmail.com");
		
		driver.findElement(By.id("pass"));
		
		driver.findElement(By.name("login")).click();
	}

}
