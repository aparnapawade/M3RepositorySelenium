package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingXpathByLogicalAndOperator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/HTML_Selenium/Xpath%20by%20Logical%20And.html");
		driver.findElement(By.xpath("//input[@name='gender' and @value='M']")).click();
	}

}
