package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatingAddtoCartButtonAmazonUsingXpathByAxes {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Motorola");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//span[contains (text() , 'Edge 50 Fusion 5G (Hot Pink, 12GB RAM, 256GB Storage)')]/../../../..//button[text() = 'Add to cart']")).click();
		
	}

}
