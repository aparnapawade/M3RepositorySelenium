package org.actionsclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDoubleClickUsingActions2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=testing");
		
		WebElement addButton = driver.findElement(By.id("add"));
		WebElement minusButton = driver.findElement(By.id("minus"));
		
		Actions actions = new Actions(driver);
		actions.doubleClick(addButton).perform();
		actions.doubleClick(addButton).perform();
		actions.doubleClick(addButton).perform();
		Thread.sleep(2000);
		actions.doubleClick(minusButton).perform();
	}

}
