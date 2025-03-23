package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingXpathByStartsWith {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("asian sneakers for men");
		
		driver.findElement(By.xpath("//input[starts-with(@title, 'Search')]")).click();

	}

}
