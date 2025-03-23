package org.webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateUsingNavigationInterfaceMethods2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//Navigating to Facebook using get(String url) method
		driver.get("https://www.facebook.com/");
		
		//Navigating to Selenium using get(String url) method
		driver.get("https://www.selenium.dev/");
		
		//Navigating back
		driver.navigate().back();
		
		Thread.sleep(3000);                      //To observe the changes added Threads--need to handle it as it is checked Exceptions either throws-declare it ot use try-catch blocks
		//Navigating forward
		driver.navigate().forward();
		
		Thread.sleep(3000);
		//refreshing the page
		driver.navigate().refresh();
		
		//Navigating to Instagram using to(String url) method
		driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
		
		//Navigating to Shoppersstack using to(URL url) method
		//instead of directly creating object of URL class type--we can store it and then can use as well
		//URL url = new URL("https://www.shoppersstack.com/")
		
		 driver.navigate().to(new URL("https://www.shoppersstack.com/"));

	}

}
