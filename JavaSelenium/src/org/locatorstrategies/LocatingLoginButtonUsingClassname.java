package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingLoginButtonUsingClassname {

	public static void main(String[] args) {

		// To launch the empty browser
		WebDriver driver = new ChromeDriver();

		//To maximize the browser
		driver.manage().window().maximize();
		
		//To navigate into an application
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();

		driver.findElement(By.id("Email")).sendKeys("swamisamarth@yahoo.com");

		driver.findElement(By.id("Password")).sendKeys("12345!@");

		driver.findElement(By.className("login-button")).click();

	}

}
