package org.locatorstrategies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingRadioButtonsOfDWSUsingFindelements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		/*
		   For Input TextBox: //input[@type='text' or @type='password' or @type='number'] 
		   depends on what asking for--if asking for only text
		 * For Dropdown: //select 
		 * For Radiobutton: //input[@type='radiobutton']
		 * For Checkbox: //input[@type = 'checkbox']
		 */
		
		driver.findElement(By.linkText("Register")).click();
		
		List<WebElement> textBoxes = driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		
		System.out.println(textBoxes.size() + " text boxes are present in DWS register page");

	}

}
