package org.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchToActiveElement2 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.switchTo().activeElement().sendKeys("Akkalkot");

	}

}
