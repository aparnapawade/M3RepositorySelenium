package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingRegisterLinkTextOfDemowebshopUsingLinkTextLocator {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//To locate the Register LinkText using LinkText locator
		//To use LinkText make sure we don't have any extra space within it
		//Check the LinkText visible on webpage and within html code is same or different--if case is different then always go for the one which is showing on WebPage
		driver.findElement(By.linkText("Register")).click();
	
	
	}

}
