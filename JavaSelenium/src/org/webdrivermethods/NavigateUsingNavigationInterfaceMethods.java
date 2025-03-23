package org.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateUsingNavigationInterfaceMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://maps.google.com/");
		driver.get("https://www.actitime.com/");
		
		// If want to observe the changes-actions then add the thread and declare-throw it for 3s as Thread.sleep(3000) before every action
		
		 Navigation nav = driver.navigate();  //will return Navigation Interface reference which has inbuilt methods
		 
		 nav.back();
		 nav.forward();
		 nav.refresh();

	}

}
