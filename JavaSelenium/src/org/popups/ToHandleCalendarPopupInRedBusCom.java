package org.popups;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleCalendarPopupInRedBusCom {

	public static void main(String[] args) {
		
		LocalDateTime ltd = LocalDateTime.now();
		int date = ltd.getDayOfMonth();
		String monthTemp = ltd.getMonth().toString();
		String month = monthTemp.charAt(0)+ (monthTemp.substring(1).toLowerCase());
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.com/");
		driver.findElement(By.id("date-box")).click();
	//	driver.findElement(By.xpath("//div[text()='February']/../..//span[text()='11']")).click();
		driver.findElement(By.xpath("//div[text()='"+ month +"']/../..//span[text()='"+ date +"']")).click();    //dynamic xpath
	}

}
