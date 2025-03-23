package org.actionsclassmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformScrollingByUsingScrollByAmount {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ferrerorocher.com/in/en/");
		
		 Actions actions = new Actions(driver);
		 actions.scrollByAmount(0, 800).perform();
		 Thread.sleep(2000);
		 actions.scrollByAmount(0, 700).perform();
	}

}
