package org.actionsclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMouseHoverUsingOffset {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		Thread.sleep(14000);
		driver.findElement(By.xpath("//button[text() = 'No, don’t.']")).click();
	    //Creating object for Actions class which accepts WebDriver type of reference
		Actions actions = new Actions(driver);
		//Using moveByOffset() to mousehover on specific located element
		actions.moveByOffset(620, 120).perform();  //to mousehover on HomeAppliances
		Thread.sleep(2000);
		actions.moveByOffset(820-620, 120-120).perform(); //to mousehover on Computers
	}

}
