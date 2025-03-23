package org.popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUploadPopupInNaukri {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//h2[contains(text(), 'experienced')]")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Runtime.getRuntime().exec("F:/HTML_Selenium/AutoIt1.exe");

	}

}
