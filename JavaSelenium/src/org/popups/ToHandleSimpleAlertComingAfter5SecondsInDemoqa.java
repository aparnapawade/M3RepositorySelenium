package org.popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleSimpleAlertComingAfter5SecondsInDemoqa {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demoqa.com/alerts");
	driver.findElement(By.id("timerAlertButton")).click();
	WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(15));
	explicit.until(ExpectedConditions.alertIsPresent());
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	}

}
