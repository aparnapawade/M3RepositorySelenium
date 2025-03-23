package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingXpathByAxes {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("file:///F:/HTML_Selenium/XpathAxes.html");
		 
		 WebElement text = driver.findElement(By.xpath("//div[@class='Mammal']/..//div[@class='Fish']"));
		 
		String text1 = text.getText();
		
		System.out.println(text1);

	}

}
