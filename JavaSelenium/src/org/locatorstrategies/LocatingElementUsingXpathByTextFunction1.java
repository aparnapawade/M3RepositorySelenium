package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingXpathByTextFunction1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.browserstack.com/");
		
		WebElement text = driver.findElement(By.xpath("//a[text() = 'Get started free']"));
		
		text.getText();
		System.out.println(text);
		
		text.click();
		
		//String text = driver.findElement(By.xpath("//a[text() = 'Get started free']")).getText();
		//System.out.println(text);
		

	}

}
