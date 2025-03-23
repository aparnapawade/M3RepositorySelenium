package org.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignmentOfFBUsingGetSizeAndGetPosition {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement emailTextBox = driver.findElement(By.id("email"));

		WebElement passwordTextBox = driver.findElement(By.id("passContainer"));

		Dimension emailTextBoxSize = emailTextBox.getSize();

		Dimension passwordTextBoxSize = passwordTextBox.getSize();

		// System.out.println(emailTextBoxSize);
		// System.out.println(passwordTextBoxSize);

		Point emailTextBoxLocation = emailTextBox.getLocation();

		Point passwordTextBoxLocation = passwordTextBox.getLocation();

		// System.out.println(emailTextBoxLocation);
		// System.out.println(passwordTextBoxLocation);

		//For Left Alignment
		int leftAlignmentDifference = emailTextBoxLocation.getX() - passwordTextBoxLocation.getX();

		if (leftAlignmentDifference < 3 && leftAlignmentDifference > -3) 
		{
			System.out.println("Left alignment is perfect");
		} 
		else 
		{
			System.out.println("Left alignment is not correct");
		}
		
		
		//For Right Alignment	
		int rightAlignmentDifference = (emailTextBoxLocation.getX()+emailTextBoxSize.getWidth()) - (passwordTextBoxLocation.getX()+passwordTextBoxSize.getWidth());
		
		if (rightAlignmentDifference < 3 && rightAlignmentDifference > -3) 
		{
			System.out.println("Right alignment is perfect");
		} 
		else 
		{
			System.out.println("Right alignment is not correct");
		}
		
		
		//For Overlapping
		int overlapDifference = passwordTextBoxLocation.getY() - (emailTextBoxLocation.getY() + emailTextBoxSize.getHeight());
		
		if(overlapDifference > 0)
		{
			System.out.println("Not overlapped");
		}
		else
		{
			System.out.println("Overlapped");
		}
	}

}
