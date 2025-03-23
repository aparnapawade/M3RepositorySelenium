package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatingAmazonElementUsingPartialLinkText {

	public static void main(String[] args) {
		// To launch the empty browser
		WebDriver driver = new EdgeDriver();

		//To maximize the browser
		driver.manage().window().maximize();
		
		//To navigate into an application
		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Brain");

		driver.findElement(By.id("nav-search-submit-button")).click();

		driver.findElement(By.partialLinkText("Color-Coded Life Size")).click();

	}

}
