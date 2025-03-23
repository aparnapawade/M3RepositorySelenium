package org.actionsclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDropInDhtml {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement capital = driver.findElement(By.id("box1"));
		WebElement country = driver.findElement(By.id("box101"));
		
		//Fetching background color of element to verify it if dragged at right place or not
		String bgColor= capital.getCssValue("background-color");
		System.out.println(bgColor);
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(capital, country).perform();
		
		//Fetching background color of element to verify it if dragged at right place or not
		bgColor= capital.getCssValue("background-color");
		System.out.println(bgColor);
	}

}
