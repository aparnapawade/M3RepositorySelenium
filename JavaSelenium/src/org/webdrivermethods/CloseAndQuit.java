package org.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		
		// To launch the empty browser
		WebDriver driver = new ChromeDriver();
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		//To navigate into an application
		driver.get("https://www.kitkat.in/");
		
		//newWindow(WindowType.TAB) -----> To open the new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.ferrerorocher.com/in/en");
		
		//newWindow(WindowType.WINDOW) -----> To open the new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.cadbury.co.uk/");
		
		//close() -----> Used to close the window or tab where the control is present currently
		Thread.sleep(3000);
		driver.close();
		
		//quit() -----> Used to close all the windows or all the tabs ---- irrespective where the control is present
		Thread.sleep(3000);
		driver.quit();

	}

}
