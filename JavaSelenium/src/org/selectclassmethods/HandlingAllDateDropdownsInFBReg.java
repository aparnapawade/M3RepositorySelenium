package org.selectclassmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingAllDateDropdownsInFBReg {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		
		WebElement dateDropdown = driver.findElement(By.id("day"));
		Select select = null;
		
		//For Accessing All the dates
		select = new Select(dateDropdown);
		List<WebElement> allDates = select.getOptions();
		int i=0;
		for(WebElement date : allDates)
		{
			select.selectByIndex(i);
			i++;
		}
		
		//For Accessing all the months
		WebElement monthDropdown = driver.findElement(By.id("month"));
		select = new Select(monthDropdown);
		List<WebElement> allMonths = select.getOptions();
		for(WebElement month : allMonths)
		{
			String visibleText = month.getText();
			select.selectByVisibleText(visibleText);
		}
		
		//For Accessing all the years
		WebElement yearDropdown = driver.findElement(By.id("year"));
		select = new Select(yearDropdown);
		List<WebElement> allYears = select.getOptions();
		for( WebElement year : allYears)
		{
			String value = year.getAttribute("value");
			select.selectByValue(value);
		}
	}

}
