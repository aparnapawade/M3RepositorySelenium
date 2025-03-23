package org.popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptAlertInDemoqa {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("I Love My India");
		alert.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
	}
}
