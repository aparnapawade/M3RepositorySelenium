package org.popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleSimpleAlertInDWS {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.findElement(By.xpath("//input[@value='Search']")).click();
		 Alert alert = driver.switchTo().alert();
		 String text = alert.getText();
		 System.out.println(text);
		 alert.accept();
	}
	
}
