package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatingPriceOfProductInAmazonUsingXpath {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nike shoes");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String price = driver.findElement(By.xpath("//span[contains(text(), 'Court Royale 2 Sneaker')]/../../../..//span[@class='a-price-whole']")).getText();

		System.out.println(price);
	}

}
