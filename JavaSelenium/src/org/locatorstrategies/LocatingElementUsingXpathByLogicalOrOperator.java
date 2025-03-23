package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingXpathByLogicalOrOperator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/HTML_Selenium/Xpath%20by%20Logical%20Or.html");
		WebElement firstNameTextbox = driver.findElement(By.xpath("//input[@id='f-name' or @name='first']"));
		firstNameTextbox.clear();
		firstNameTextbox.sendKeys("Aparna");

	}

}
