package org.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingSourceCodeInFacebook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    String sourcecode = driver.getPageSource();
	    System.out.println(sourcecode);
	     

	}

}