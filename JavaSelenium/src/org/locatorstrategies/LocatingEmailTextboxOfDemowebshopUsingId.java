package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingEmailTextboxOfDemowebshopUsingId {
	
	public static void main(String[] args) {
		//To launch an empty browser
		 WebDriver driver = new ChromeDriver();
		 
		 //To maximize the browser
		 driver.manage().window().maximize();
		 
		 //To navigate into an application
		 driver.get("https://demowebshop.tricentis.com/login");
		 
		 //Locating the Email Textbox using ID locator strategy
		 //If need to use the element multiple times- then we can store the reference otherwise can directly use.
		 WebElement emailTextbox = driver.findElement(By.id("Email"));
		 emailTextbox.sendKeys("Aparna@gmail.com");
		 
		//Locating the Password Textbox using ID locator strategy
		 driver.findElement(By.id("Password")).sendKeys("12345@!");
		 
		//Locating the Remember Password Checkbox using ID locator strategy
		 //WebElement Interface has a method ------ click() which is used to click on webelement
		 driver.findElement(By.id("RememberMe")).click();

}
}
