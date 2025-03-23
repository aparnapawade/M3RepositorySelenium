package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingDWSLoginButtonUsingCssSelector {

	public static void main(String[] args) {
		
		//To launch the empty browser
		WebDriver driver = new ChromeDriver();
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		//To navigate into an application
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("swamisamarth@yahoo.com");
		
		driver.findElement(By.id("Password")).sendKeys("12345!@");
		
		//To locate Login button using cssSelector()
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		

	}

}
