package org.webdrivermethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagingWindowFetchingSettingPosition {

	public static void main(String[] args) throws InterruptedException {
		
		//To launch empty browser
		WebDriver driver = new ChromeDriver();
		
		//To navigate to application
		driver.get("https://www.selenium.dev/");
		
		//TO get the position of browser
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		
		//To get the X and Y co-ordinates separately
		System.out.println(position.getX());    //getX() will gives x-coordinate position
		System.out.println(position.getY());    //getY() will gives y-coordinate position
		
		//To set the position of browser
		Thread.sleep(3000);
		Point targetposition = new Point(200,400);    //if giving (0, 0) browser will not get in corner ---if gives (-8, -8) then only will go in corner--bcz around original visible screenposition some minor small position it will be around with
		                                              //position will be calculated from left top corner of the screen
		driver.manage().window().setPosition(targetposition);

	}

}
