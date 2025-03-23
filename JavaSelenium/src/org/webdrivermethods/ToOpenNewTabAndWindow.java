package org.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenNewTabAndWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		//To open the new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.shoppersstack.com/");
		
		//To open new Window
		driver.switchTo().newWindow(org.openqa.selenium.WindowType.WINDOW);
		driver.get("https://www.fireflink.com/signin");

	}

}
