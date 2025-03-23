package org.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandFrameInDeam11 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		
	//	driver.switchTo().frame(0);     //----> frame(int index)
	//	driver.switchTo().frame("send-sms-iframe");    //----> frame(String nameOrId)
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(frameElement);      //---->frame(WebElement frameElement)
		driver.findElement(By.id("regEmail")).sendKeys("9876543210");
		driver.switchTo().defaultContent();    //----> To switch to defaultContent from frame
		driver.findElement(By.id("hamburger")).click();
	}

}
