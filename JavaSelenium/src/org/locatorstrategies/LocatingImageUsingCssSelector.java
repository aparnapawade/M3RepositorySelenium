package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatingImageUsingCssSelector {

	public static void main(String[] args) {
		//To launch the empty browser
		WebDriver driver = new EdgeDriver();
				
		//To maximize the browser
		driver.manage().window().maximize();
				
		//To navigate into an application
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.linkText("Mobiles")).click();
		
		//To locate Image using cssSelector()
		WebElement iPhone13Image = driver.findElement(By.cssSelector("img[alt='iPhone 13']"));
		iPhone13Image.click();

	}

}
