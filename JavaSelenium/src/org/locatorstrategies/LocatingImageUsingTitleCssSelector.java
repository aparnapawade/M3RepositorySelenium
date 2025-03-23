package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingImageUsingTitleCssSelector {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		//To navigate into an application
		driver.get("https://demowebshop.tricentis.com/");
		
		//Locating link using partialLinkText()
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		
		//Locating product-ToolTipText using cssSelector()
		driver.findElement(By.cssSelector("img[title='Show products in category Cell phones']")).click();
		
		//Locating product-ToolTipText using cssSelector()
		driver.findElement(By.cssSelector("img[title='Show details for Smartphone']")).click();
	}

}
