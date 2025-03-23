package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAllElementsOfDemowebshopUsingIdAndNameLocators {
	
public static void main(String[] args) {
		
	    //To launch the empty browser
		WebDriver driver = new ChromeDriver();
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		//To navigate into an application
		driver.get("https://demowebshop.tricentis.com/register");
		
		//To locate the Gender Webelement and selecting it as Female
		driver.findElement(By.id("gender-female")).click();
		
		//To locate the FirstName Webelement
		driver.findElement(By.id("FirstName")).sendKeys("Swami");
		
		//To locate the LastName Webelement
		driver.findElement(By.id("LastName")).sendKeys("Samarth");
		
		//To locate the Email Webelement
		driver.findElement(By.id("Email")).sendKeys("swamisamarth@yahoo.com");
		
		//To locate the Password Webelement
		driver.findElement(By.id("Password")).sendKeys("12345!@");
		
		//To locate the Confirm password Webelement
		driver.findElement(By.id("ConfirmPassword")).sendKeys("12345!@");
		
		//To locate the Register Webelement
		driver.findElement(By.id("register-button")).click();
				
}
}
