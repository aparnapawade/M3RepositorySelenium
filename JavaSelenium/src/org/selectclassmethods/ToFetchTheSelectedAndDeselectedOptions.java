package org.selectclassmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToFetchTheSelectedAndDeselectedOptions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement coursesDropdown = driver.findElement(By.id("cars"));
		Select select = new Select(coursesDropdown);
		
		select.selectByIndex(0);
		select.selectByValue("199");
		select.selectByVisibleText("More Than INR 500 ( 55 )");
		
		//Fetching first selected option
		System.out.println("===== First Selected Option =====");
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		//Fetching all the options
		List<WebElement> allOptions = select.getOptions();
		System.out.println(allOptions.size());    //Fetching the size of allOptions List
		
		//Fetching all the selected options
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		System.out.println(allSelectedOptions.size());    //Fetching the size of allSelectedOptions List
		
		System.out.println("======== Selected options =======");
		for( WebElement selectedOption : allSelectedOptions)
		{
			System.out.println(selectedOption.getText());
		}
		
		//Fetching all unselected options
	    allOptions.removeAll(allSelectedOptions);        //Using removeall() method of collection to remove selected options from all options
		System.out.println("===== Unselected options =====");
		for(WebElement unselectedOption : allOptions)
		{
			System.out.println(unselectedOption.getText());
		}
		
	}

}
