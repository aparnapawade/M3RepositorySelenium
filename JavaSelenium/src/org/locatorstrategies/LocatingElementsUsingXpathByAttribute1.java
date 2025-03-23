package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementsUsingXpathByAttribute1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/account/create");
		
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Aparna");
		
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Deshmukh");
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Aparna12345");
		

	}

}
