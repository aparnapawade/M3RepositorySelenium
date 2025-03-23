package org.popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToAvoidNotificationPopupInLic {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://licindia.in/");
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for(String windowId : allWindowIds)
		{
			driver.switchTo().window(windowId);
		}
		driver.findElement(By.xpath("//button[text() = 'Close']")).click();
		driver.findElement(By.linkText("Pay Premium")).click();
		driver.navigate().refresh();
	}

}