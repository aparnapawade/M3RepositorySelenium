package org.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTextboxIsEnabledOrNot {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement textBox = driver.findElement(By.xpath("//b[text()='Become a Subscriber']/../../..//input"));
		if(textBox.isEnabled())
		{
			System.out.println("Text box is Enabled");
		}
		else
		{
			System.out.println("Text Box is Disabled");
		}
	}

}
