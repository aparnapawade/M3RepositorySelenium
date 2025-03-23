package org.selectclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingADropdownInFBReg {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select select = new Select(monthDropdown);

		// To verify whether dropdown is Single select or Multi select
		if (select.isMultiple()) 
		{
			System.out.println("It is a Multi-select dropdown");
		} 
		else 
		{
			System.out.println("It is a Single-select dropdown");
		}

		// Selecting option based on Index
		select.selectByIndex(5);

		Thread.sleep(2000);

		// Selecting option based on Value
		select.selectByValue("10");

		Thread.sleep(2000);

		// Selecting option based on VisibleText
		select.selectByVisibleText("Nov");
	}

}
