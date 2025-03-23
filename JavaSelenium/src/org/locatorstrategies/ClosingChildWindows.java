package org.locatorstrategies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingChildWindows {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Aparna%20Deshmukh/Downloads/Assign.html");
		
		String parentWindowId = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[text() = 'Click Me']")).click();
		
		Thread.sleep(3000);
		
		Set<String> allWindowIds = driver.getWindowHandles();
		//To keep the main window and close all other child windows
		allWindowIds.remove(parentWindowId);
		
		for(String windowId : allWindowIds)
		{
			Thread.sleep(3000);
			driver.switchTo().window(windowId);
			driver.close();
	    }
	}
}
