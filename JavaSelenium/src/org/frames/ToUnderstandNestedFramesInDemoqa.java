package org.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandNestedFramesInDemoqa {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		WebElement parentFrameText = driver.findElement(By.tagName("body"));
		System.out.println(parentFrameText.getText());
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childFrame);
		WebElement childFrameText = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		System.out.println(childFrameText.getText());
		driver.switchTo().parentFrame();
		System.out.println(parentFrameText.getText());
		
	}

}
