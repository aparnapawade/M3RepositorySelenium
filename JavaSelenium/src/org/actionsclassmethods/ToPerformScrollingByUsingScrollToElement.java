package org.actionsclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformScrollingByUsingScrollToElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		Actions actions = new Actions(driver);
		WebElement wakad = driver.findElement(By.xpath("//h5[text() = 'Wakad']"));
		
		actions.scrollToElement(wakad).pause(2000).scrollByAmount(0, 200).perform();
	}

}
