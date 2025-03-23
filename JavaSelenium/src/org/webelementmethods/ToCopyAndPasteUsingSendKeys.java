package org.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCopyAndPasteUsingSendKeys {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();

		WebElement emailTextBox = driver.switchTo().activeElement();
		
		emailTextBox.sendKeys("swamisamarth@yahoo.com", Keys.CONTROL+"a");
		
		Thread.sleep(2000);
		
		emailTextBox.sendKeys(Keys.CONTROL+"c");   //to cut it : Keys.CONTROL+"x"
		
		Thread.sleep(2000);
		
		emailTextBox.sendKeys(Keys.TAB, Keys.CONTROL+"V");
		
		
	}

}
