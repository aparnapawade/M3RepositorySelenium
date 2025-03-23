package org.actionsclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformContextClickUsingActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/");
		WebElement mergePdf = driver.findElement(By.xpath("//h3[text() = 'Merge PDF']"));
		
		Actions actions = new Actions(driver);
		actions.contextClick(mergePdf).perform();
	//	actions.moveToElement(mergePdf).contextClick().perform();
	}

}
