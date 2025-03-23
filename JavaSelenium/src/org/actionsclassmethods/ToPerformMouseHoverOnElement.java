package org.actionsclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMouseHoverOnElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'No, don’t.']")).click();
		WebElement homeAppliances = driver.findElement(By.xpath("//div[text() = 'Home Appliances']"));
	     
	     //Creating object for Actions class which accepts WebDriver type of reference
	     Actions actions = new Actions(driver);
	     
	     //Using moveToElement() to mousehover on specific located element
	     //If need to perform any actions using Actions class methods then need to use perform()
	     actions.moveToElement(homeAppliances).perform();
	     
	}

}
