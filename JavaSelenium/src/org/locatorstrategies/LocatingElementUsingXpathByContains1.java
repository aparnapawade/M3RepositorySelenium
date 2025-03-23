package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingXpathByContains1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("asian sneakers for men");
		
	    driver.findElement(By.xpath("//button[contains(@title, 'Search')]")).click();
	    
	    driver.findElement(By.xpath("//a[@title='High Tops For Men']")).click();
	    
	    
	}

}
