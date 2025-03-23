package org.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollTillElementIsVisible {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element = driver.findElement(By.linkText("14.1-inch Laptop"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(false)", element); //view will scroll down if gives false -- element located will be at bottom -as the page designed
		Thread.sleep(3000);
		jse.executeScript("arguments[0].scrollIntoView(true)", element); //view will scroll up if gives true -- element located will go to top
		
		//ScrollTo method to scroll
		jse.executeScript("window.scrollTo(0,500)");
	}

}
