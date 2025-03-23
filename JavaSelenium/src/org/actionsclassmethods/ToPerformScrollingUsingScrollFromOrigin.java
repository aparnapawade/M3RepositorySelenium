package org.actionsclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ToPerformScrollingUsingScrollFromOrigin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(14000);
		WebElement resumeWritingLink = driver.findElement(By.xpath("//span[text() = 'Resume writing']"));
		Actions actions= new Actions(driver);
		actions.scrollFromOrigin(ScrollOrigin.fromElement(resumeWritingLink), 0, 200);
	/*  // OR
	    ScrollOrigin so = ScrollOrigin.fromElement(resumeWritingLink);
		actions.scrollFromOrigin(so, 0, 200);
	*/
		resumeWritingLink.click();
	}

}
