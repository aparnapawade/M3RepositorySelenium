package org.webdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToParticularTabOrWindowBasedOnURL {

	public static void main(String[] args) throws InterruptedException {
		//To launch the empty browser
		WebDriver driver = new ChromeDriver();
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//To navigate into an application
		driver.get("https://jokerandwitch.com/");
		
		//To switch to new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.fastrack.in/");
		
		//To switch to new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.titan.co.in/");
		
		//To switch to new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.rolex.com/");
		
		//Setting an expected url to compare it with actual url. So, that we can stop on that specific window where url matches.
		//For matching the actual url and expected url used the equals()
		 String expectedURL = "https://www.titan.co.in/";
		
		//Fetching all windows windowsid using getWindowHandles() method
	    //Then storing it for accessing separately using for-each loop
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String windowId : allWindowIds)
		{
			Thread.sleep(2000);
			driver.switchTo().window(windowId);
			String actualURL = driver.getCurrentUrl();
			if(actualURL.equals(expectedURL))
			{
				break;
			}
		}

	}

}
