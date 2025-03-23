package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToQspidersAndSendMessage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chat.qspiders.com/");
		
		driver.findElement(By.id("username")).sendKeys("7350619996");
		
		driver.findElement(By.id("password")).sendKeys("NikPinky$28618");
		
		driver.findElement(By.xpath("//button[text() = 'Login']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[text()='Harshavardhan G R']")).click();
		
	//	driver.findElement(By.xpath("//span[text() = 'Wednesday 1:03 PM']")).click();
		
	// driver.findElement(By.xpath("//div[@class='_chat_listUser__7px9Q'][7]"));
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("message")).sendKeys("Hi", Keys.ENTER);
	}

}
