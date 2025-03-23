package org.selectclassmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingAllDateDropdownsInFBRegAlternative {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		
		WebElement dateDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
	
	//Automating all the date options using selectByIndex)
		Select dateSelect = new Select(dateDropdown);
		List<WebElement> allDates = dateSelect.getOptions();
		for(int index=0 ;index<allDates.size(); index++)
		{
			dateSelect.selectByIndex(index);
		}
		
	//Automating all the month options using selectByValue()
		Select monthSelect = new Select(monthDropdown);
		List<WebElement> allMonths = monthSelect.getOptions();
		for(WebElement month : allMonths)
		{
			String value = month.getAttribute("value");
			monthSelect.selectByValue(value);
		}
		
	//Automating all the year options using selectByVisibleText()	
		Select yearSelect = new Select(yearDropdown);
		if(yearSelect.isMultiple())
		{
			System.out.println("It is Multi-select dropdown");
		}
		else
		{
			System.out.println("It is a Single-select dropdown");
		}
		List<WebElement> allYears = yearSelect.getOptions();
		for(WebElement year : allYears)
		{
			String visibleText = year.getText();
			yearSelect.selectByVisibleText(visibleText);
		}
	}

}
