package org.locatorstrategies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingUsingXpathTextFunctionAndSwitchingClosing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Aparna%20Deshmukh/Downloads/Assign.html");
		
		driver.findElement(By.xpath("//button[text() = 'Click Me']")).click();
		
		String expectedTitle1 = "Swiggy";
		String expectedTitle2 = "Zomato";
		String expectedTitle3 = "Mr Biryaniii";
		String expectedTitle4 = "Faasos";

		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String windowId : allWindowIds)
		{
			Thread.sleep(3000);
			driver.switchTo().window(windowId);
			String actualTitle = driver.getTitle();
			if(actualTitle.contains(expectedTitle1))
			{
				Thread.sleep(3000);
				driver.close();
			}
			else if(actualTitle.contains(expectedTitle2))
			{
				Thread.sleep(3000);
				driver.close();
			}
			else if(actualTitle.contains(expectedTitle3))
			{
				Thread.sleep(3000);
				driver.close();
			}
			else if(actualTitle.contains(expectedTitle4))
			{
				Thread.sleep(3000);
				driver.close();
			}
		}

	}

}
