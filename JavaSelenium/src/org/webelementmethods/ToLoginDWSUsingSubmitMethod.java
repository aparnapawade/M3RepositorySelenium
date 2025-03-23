package org.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLoginDWSUsingSubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();

		WebElement emailTextBox = driver.switchTo().activeElement();
		
		emailTextBox.sendKeys("swamisamarth@yahoo.com", Keys.TAB, "12345!@");
		
		driver.findElement(By.cssSelector("input[value= 'Log in']")).submit();			
		
	}

}
