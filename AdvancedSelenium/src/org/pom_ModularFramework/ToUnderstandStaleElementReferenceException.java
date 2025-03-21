package org.pom_ModularFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandStaleElementReferenceException {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement email = driver.findElement(By.id("Email"));
		
		driver.navigate().refresh();
		
		email.sendKeys("swamisamarth@yahoo.com");  // will get StaleElementReferenceException as page is getting refreshed
		//and email variable is holding the old address of webelement--and after refresh of page the address email variable holding will get changed
		//We can relocate the email element again and can avoid this issue
		//driver.findElement(By.id("Email")).sendKeys("swamisamarth@yahoo.com"); 
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("12345!@");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();	
	}

}
