package org.dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSLoginValidUsingMethods implements IAutoConstant{
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		Flib flib = new Flib();  //Object creation of Flib class--so that we can access non-static methods created inside it 
		String url = flib.readPropertyData(PROP_PATH, URL);  //To fetch URL from Property file
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		for(int i=1; i<=1; i++)
		{
			String email= flib.readExcelData(EXCEL_PATH, DWSVALID, i, 0);  //To fetch Email from Excel
			String password = flib.readExcelData(EXCEL_PATH, DWSVALID, i, 1); //To fetch Password from Excel

		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		}
	}

}
