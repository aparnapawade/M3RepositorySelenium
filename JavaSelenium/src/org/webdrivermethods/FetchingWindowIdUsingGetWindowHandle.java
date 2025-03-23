package org.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingWindowIdUsingGetWindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String windowid = driver.getWindowHandle();
		System.out.println(windowid);

	}

}
