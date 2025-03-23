package org.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyRadioButtonIsSelectedOrNotUsinfIsDisplayedAndIsSelected {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']//input"));
		if(!maleRadioButton.isSelected())
		{
			maleRadioButton.click();
		}
		
		WebElement customRadioButton = driver.findElement(By.xpath("//label[text()='Custom']//input"));
		WebElement customGenderTextBox = driver.findElement(By.id("custom_gender"));
		
		if(!customGenderTextBox.isDisplayed())
		{
			customRadioButton.click();
		}
		customGenderTextBox.sendKeys("ABCD");
	}

}
