package org.selectclassmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiselectDropdownInOmayo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement multiSelectionBox = driver.findElement(By.id("multiselect1"));
		Select select = new Select(multiSelectionBox);
		
		//Fetching all the Options
		List<WebElement> allOptions = select.getOptions();
		for(WebElement option : allOptions)
		{
			String visibleText = option.getText();
			select.selectByVisibleText(visibleText);
		}
		
		//De-selecting an option using deselectByIndex()
		//Indexing starts from 0 in select class method
		Thread.sleep(2000);
		select.deselectByIndex(0);
		
		//De-selecting an option using deselectByIndex()
		Thread.sleep(2000);
		select.deselectByValue("swiftx");
		
		//De-selecting an option using deselectByVisibleText()
		Thread.sleep(2000);
		select.deselectByVisibleText("Audi");
		
		//Selecting an option using selectByVisibleText()
		Thread.sleep(2000);
		select.selectByVisibleText("Volvo");
		
		//De-selecting all the options which are selected
		Thread.sleep(2000);
		select.deselectAll();
	}
}
