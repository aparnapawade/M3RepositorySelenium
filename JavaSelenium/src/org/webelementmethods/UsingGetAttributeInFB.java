package org.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetAttributeInFB {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement emailTextBox = driver.findElement(By.id("email"));

		String email = "aparnadeshmukh2013@gmail.com";

		emailTextBox.sendKeys(email);

		// Verifying the value we entered and saved within value attribute is same or not
		String enteredEmail = emailTextBox.getAttribute("value");

		if (email.equals(enteredEmail)) 
		{
			System.out.println("Email is entered successfully");
		} 
		else 
		{
			System.out.println("Email is not properly entered");
		}
	}

}
