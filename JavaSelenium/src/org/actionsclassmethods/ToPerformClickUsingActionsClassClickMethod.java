package org.actionsclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformClickUsingActionsClassClickMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		WebElement dateBox = driver.findElement(By.id("date-box"));
		
		Actions actions = new Actions(driver);
		actions.click(dateBox).perform();
	//	actions.moveToElement(dateBox).click().perform();
	}

}
