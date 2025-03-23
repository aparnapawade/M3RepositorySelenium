package org.webdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToParticularTabOrWindowBasedonTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.redbus.in/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.makemytrip.com/");
		
		String expectedTitle = "Bus Ticket Booking Online made Easy, Secure with Top Bus Operators - redBus";

		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String windowId : allWindowIds)
		{
			Thread.sleep(2000);
			driver.switchTo().window(windowId);
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(expectedTitle))
			{
				break;
			}
			
		}
		
	}
}