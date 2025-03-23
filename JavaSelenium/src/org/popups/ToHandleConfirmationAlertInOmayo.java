package org.popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationAlertInOmayo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("confirm")).click();
		//Before alert is coming if we are trying to switch to alert will get --> NoAlertPresentException
		Alert alert = driver.switchTo().alert();
		//After alert is coming-- we have not handled it and trying to click on any webelement on webpage will get --> UnhandledAlertException
		System.out.println(alert.getText());
		alert.accept(); //To click on OK
	//	alert.dismiss(); //To click on Cancel
}

}
