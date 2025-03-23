package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingMotorcyclesLinkTextOfJawaMotorsUsingLinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jawamotorcycles.com/");
		
		//If in linktext we take Motorcycles as written in HTML code it will not open the link and throws NoSuchElementException
		//As the MOTORCYCLES on webpage and Motorcycles on html code --cases are different
		driver.findElement(By.linkText("MOTORCYCLES")).click();

	}

}
