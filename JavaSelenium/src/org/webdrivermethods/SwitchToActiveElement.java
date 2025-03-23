package org.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveElement {

	public static void main(String[] args) {
		
		//To launch the browser
		WebDriver driver = new ChromeDriver();
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		//To navigate into application
		driver.get("https://www.google.com/");
		
        //switchTo() used for switching to active element of Google
		//driver.switchTo().activeElement().sendKeys("Shri Swami Samarth");
		
		//alternative to switch by storing reference
		WebElement searchbox = driver.switchTo().activeElement();
         searchbox.sendKeys("Aparna Deshmukh");
	}

}
