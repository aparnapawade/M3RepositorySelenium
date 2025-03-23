package org.locatorstrategies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AddingAllTheProductsToCartUsingFindElements {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 16");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> allAddToCartButtons = driver.findElements(By.xpath("//button[text() = 'Add to cart']"));
		
		System.out.println(allAddToCartButtons.size());
		
		for (WebElement addToCartButton :  allAddToCartButtons)
		{
			addToCartButton.click();
		}
			
	}

}
