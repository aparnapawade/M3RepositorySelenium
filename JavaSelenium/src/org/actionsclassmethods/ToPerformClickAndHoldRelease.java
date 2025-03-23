package org.actionsclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformClickAndHoldRelease {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
		
		WebElement cat = driver.findElement(By.id("box1"));
		WebElement dropbox = driver.findElement(By.id("dropBox"));
		 
		Actions actions = new Actions(driver);
		//actions.clickAndHold(cat).perform();
		actions.moveToElement(cat).clickAndHold().perform();
		//actions.release(dropbox).perform();
		actions.moveToElement(dropbox).release().perform();
		 
		
	}

}
