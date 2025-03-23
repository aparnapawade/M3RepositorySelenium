package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWishlistHavingSvgTagOfFlipkartUsingXpath {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		//Locating Search textbox Element --->Using Name Direct Locator
		driver.findElement(By.name("q")).sendKeys("Best phone under 5000");
		
		//Locating Search Button Element --->Using Xpath By Contains
		driver.findElement(By.xpath("//button[contains(@title, 'Search')]")).click();
		
		//Locating Wishlist Element which is designed using SVG(Scalable Vector Graphics) tag ---> Using Xpath by Axes Dependent and Independent
		driver.findElement(By.xpath("//div[text()= 'Easyfone New_Royale_Blue']/../../..//*[local-name()='svg']")).click();

	}

}
