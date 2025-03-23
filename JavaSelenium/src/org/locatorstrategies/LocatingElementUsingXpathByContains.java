package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingXpathByContains {

	public static void main(String[] args) {

		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 driver.findElement(By.linkText("Log in")).click();
		 
		 //Locating Welcome-visible text on which we cannot perform any function directly using xpath by contains function
		 String text = driver.findElement(By.xpath("//h1[contains(text(), 'Welcome')]")).getText();
		 System.out.println(text);
	}

}
