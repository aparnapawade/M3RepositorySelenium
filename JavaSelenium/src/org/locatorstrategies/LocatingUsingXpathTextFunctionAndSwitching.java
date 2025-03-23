package org.locatorstrategies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingUsingXpathTextFunctionAndSwitching {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Users/Aparna%20Deshmukh/Downloads/Assign.html");

		driver.findElement(By.xpath("//button[text() = 'Click Me']")).click();
		
		String expectedURL = "swiggy";

		Set<String> allWindowIds = driver.getWindowHandles();

		for (String windowId : allWindowIds) 
		{	
			Thread.sleep(2000);
			driver.switchTo().window(windowId);
			String actualURL = driver.getCurrentUrl();
			if(actualURL.contains(expectedURL))
			{
				break;
			}
			
		}
		driver.manage().window().maximize();
	}

}
