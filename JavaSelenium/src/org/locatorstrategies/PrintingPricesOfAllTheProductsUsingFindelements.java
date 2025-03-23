package org.locatorstrategies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PrintingPricesOfAllTheProductsUsingFindelements {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 16");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Locating the Prices of All the Products
		List<WebElement> priceOfAllProducts = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		//Checking the Size of List of webelements
		System.out.println(priceOfAllProducts.size());
		
		//Created a loop variable to fetch single product price from allproductprices
		for(WebElement price : priceOfAllProducts)
		{
			//printing the price of the product
			// System.out.println(price.getText());
			String s = price.getText();
			System.out.println(s);
		}
	}

}
