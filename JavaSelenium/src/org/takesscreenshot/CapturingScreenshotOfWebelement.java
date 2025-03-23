package org.takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenshotOfWebelement {

	public static void main(String[] args) throws IOException {
		
		LocalDateTime ltd = LocalDateTime.now();
		String timeStamp = ltd.toString().replaceAll(":", "-");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://cadburygifting.in/");
		
		WebElement personalisedGifts = driver.findElement(By.xpath("//a[text() = 'Personalised Gifts']/.."));
		
		File src = personalisedGifts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./errorshots/screenshot" + timeStamp +".png");
		
		FileHandler.copy(src, destination);
		
	}

}
