package org.actionsclassmethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformLoginInNewTabUsingKeydownAndKeyup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//Capturing parent window id
		String parentWindowId = driver.getWindowHandle();
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		Actions actions = new Actions(driver);
		//To open login page in new tab, before we click on login link
		//Using keyDown() to press the control key
		actions.keyDown(Keys.CONTROL).click(loginLink).perform();
		actions.keyUp(Keys.CONTROL).perform();
		//Capturing all window ids
		Set<String> allWindowIds = driver.getWindowHandles();
		//Removing parent window id from all window ids
		allWindowIds.remove(parentWindowId);
		for( String windowId : allWindowIds)
		{
			driver.switchTo().window(windowId);
		}
	}

}
