package org.takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenshotOfWebpage {

	public static void main(String[] args) throws IOException {
		
		//LocalDateTime is a class present in Java package. It has a private/default constructor so can not create an object for it.
		//But it has a static method-which returns LocalDateTime of object reference-using which we can access now() which gives current system time and details.
		LocalDateTime ltd = LocalDateTime.now();
		String timeStamp = ltd.toString().replaceAll(":", "-");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.yamaha-motor-india.com/");

		//doing non-primitive typecasting between interfaces so that we can access only the method of TakesScreenshot interface
		TakesScreenshot ts = (TakesScreenshot) driver;

		//capturing the screenshot using getScreenshotAs(OutputType.FILE) method and storing it
		File src = ts.getScreenshotAs(OutputType.FILE);

		//To copy the file to a online-within selenium folder so that anyone can access it
		//Using timestamp here so that everyscreenshot will have different names so that it will not get override
		//Creating the File type object but will get destroy once program closed, hence copyting it using FileHandler(I)-copy() method
		File destination = new File("./errorshots/screenshot" + timeStamp + ".png");
		
		FileHandler.copy(src, destination);
	}

}
