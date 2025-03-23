package org.actionsclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDropByUsingActionsAmazon {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.paiinternational.in/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[text() = 'Furniture']")).click();
		Thread.sleep(9000);
		WebElement leftSlider = driver.findElement(By.xpath("//div[@role='slider'][1]"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(leftSlider, 30, 0).perform();
		Thread.sleep(4000);
		actions.dragAndDropBy(leftSlider, -30, 0).perform();
		Thread.sleep(4000);
		WebElement rightSlider = driver.findElement(By.xpath("//div[@role='slider'][2]"));
		actions.dragAndDropBy(rightSlider, -50, 0).perform();


	}

}
