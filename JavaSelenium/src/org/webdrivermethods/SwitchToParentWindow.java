package org.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToParentWindow {

	public static void main(String[] args) {
		//To launch the empty browser
		 WebDriver driver = new ChromeDriver();
		 
		 //To maximize the browser
		 driver.manage().window().maximize();
		 
		 //To navigate into an application
		 driver.get("https://www.microsoft.com/en-in");
		 
		 //To get WindowID and then store it to use to access the same-parentwindow back using WindowID
		 String parentwindowid = driver.getWindowHandle();
		 
		 //To switch to new tab
		 driver.switchTo().newWindow(WindowType.TAB);	 
		 driver.get("https://www.akamai.com/");
		 
		//To switch to new window
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 driver.get("https://www.sophos.com/en-us");
		 
		 //To switch to parentwindow using WindowID
		 driver.switchTo().window(parentwindowid);

	}

}
