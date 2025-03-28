package org.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToEnterDataInDisabledTextbox {

	public static void main(String[] args) {
		
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.get("https://demoapp.skillrary.com/");
	   WebElement textBox = driver.findElement(By.xpath("//b[text()='Become a Subscriber']/../../..//input[@class='form-control']"));
	   JavascriptExecutor jse = (JavascriptExecutor) driver;
	   jse.executeScript("arguments[0].value='Aparna'", textBox);
	   
	   
	}

}
