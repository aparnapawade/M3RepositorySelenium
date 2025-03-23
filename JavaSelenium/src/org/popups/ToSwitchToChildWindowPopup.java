package org.popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToChildWindowPopup {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///F:/HTML_Selenium/Window%20-%20popup.html");
		String prentWindowId = driver.getWindowHandle();
		WebElement popUp = driver.findElement(By.id("PopUp"));
		popUp.click();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(prentWindowId);
		for(String windowId : allWindowIds)
		{
			driver.switchTo().window(windowId);
		}
		driver.close();  //will close child window
	}

}
