package org.webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagingWindowFetchingSizeOfBrowser {

	public static void main(String[] args) throws InterruptedException {
		//TO launch the browser
		WebDriver  driver = new ChromeDriver();
		
		//To navigate into application
		driver.get("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
		
		//To get the size ---will give is as Width&Height using getSize()
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		//To get the Height separately
		System.out.println(size.getHeight());
		
		//To get the width separately
		System.out.println(size.getWidth());
		
		//
		Thread.sleep(3000);
		 Dimension targetsize = new Dimension(500, 250);   //driver.manage().window().setSize(new Dimension(500, 250));
		 driver.manage().window().setSize(targetsize);  
	}

}
