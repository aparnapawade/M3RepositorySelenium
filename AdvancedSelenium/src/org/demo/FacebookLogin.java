package org.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Aparna");
		driver.findElement(By.id("pass")).sendKeys("12345!@");
		driver.findElement(By.name("login")).click();
	}

}
