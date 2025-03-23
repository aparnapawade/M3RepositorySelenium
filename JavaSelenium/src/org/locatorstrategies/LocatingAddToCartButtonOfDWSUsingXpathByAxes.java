package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAddToCartButtonOfDWSUsingXpathByAxes {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
		 
		driver.findElement(By.xpath("//a[text() = 'Blue Jeans']/../..//input[@value='Add to cart']")).click();
		 
		 
	}

}
