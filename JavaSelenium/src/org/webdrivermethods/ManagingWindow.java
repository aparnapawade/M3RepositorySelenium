package org.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagingWindow {

	public static void main(String[] args) throws InterruptedException {
		
		//To launch the browser
		WebDriver driver = new ChromeDriver();
		
		//To navigate into Flipkart application
		driver.get("https://www.flipkart.com/");
		
		//To maximize the browser using maximize()
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//To open the browser in fullscreen mode using fullscreen()
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		
		//To minimize the browser using minimize()
		Thread.sleep(3000);
		driver.manage().window().minimize();

	}

}
