package org.webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformingAllActionsOfWebDriverMethods {

	public static void main(String[] args) {
		 //To launch the empty browser
		 WebDriver driver = new ChromeDriver();
		 
		 //To navigate into an application
		 driver.get("https://in.bookmyshow.com/");
		 
         //To set the size as 400-400
		 driver.manage().window().setSize(new Dimension(400, 400));
		 
		 //To fetch the size
		 Dimension size = driver.manage().window().getSize();
		 System.out.println(size);
		 
		 //To navigate to new website without using get()
		 driver.navigate().to("https://www.facebook.com/");
		 
		 //To open new window
		 driver.switchTo().newWindow(org.openqa.selenium.WindowType.WINDOW);
		 
		 //To set the position
		  Point targetposition = new Point(-200,-100);
		  driver.manage().window().setPosition(targetposition);
	}

}
