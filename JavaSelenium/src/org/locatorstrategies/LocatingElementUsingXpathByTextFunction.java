package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingXpathByTextFunction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//Locating Login Link using xpath by text()
		driver.findElement(By.xpath("//a[text() = 'Log in']")).click();
		
		//Locating Email visible text using xpath by text()
		String text = driver.findElement(By.xpath("//label[text() = 'Email:']")).getText();
		 
		System.out.println(text);

	}

}
