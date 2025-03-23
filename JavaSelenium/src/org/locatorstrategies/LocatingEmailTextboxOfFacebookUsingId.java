package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingEmailTextboxOfFacebookUsingId {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/");
		 
		 WebElement emailTextbox = driver.findElement(By.id("email"));
		 emailTextbox.sendKeys("Aparna@gmail.com");
		 
		 driver.findElement(By.id("pass")).sendKeys("12345@!");

	}
}
