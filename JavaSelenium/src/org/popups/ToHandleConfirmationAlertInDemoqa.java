package org.popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationAlertInDemoqa {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().accept();
		String text = driver.findElement(By.id("confirmResult")).getText();
		System.out.println(text);
	}

}
