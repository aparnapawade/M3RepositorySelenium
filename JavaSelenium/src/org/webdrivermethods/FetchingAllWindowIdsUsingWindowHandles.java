package org.webdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingAllWindowIdsUsingWindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//To switch to new tab
		driver.switchTo().newWindow(WindowType.TAB);	
		driver.get("https://www.instagram.com/");
		
		//To switch to new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://web.whatsapp.com/");
		
		//Fetching all windows windowsid using getWindowHandles() method
		//Then storing it for accessing separately using for-each loop
		 Set<String> allwindowids = driver.getWindowHandles();
		 
		 for(String windowid: allwindowids)
		 {
			 System.out.println(windowid);
		 }
		
	}
	
}
