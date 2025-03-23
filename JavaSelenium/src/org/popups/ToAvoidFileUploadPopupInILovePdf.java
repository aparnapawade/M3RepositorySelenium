package org.popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAvoidFileUploadPopupInILovePdf {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ilovepdf.com/");
		driver.findElement(By.xpath("//h3[text() = 'PDF to Word']")).click();
		driver.findElement(By.xpath("//input[@type = 'file']")).sendKeys("C:\\Users\\Aparna Deshmukh\\Downloads\\Aparna_Deshmukh_Resume.pdf");
		driver.findElement(By.xpath("//span[text() = 'Convert to WORD']")).click();
		driver.findElement(By.xpath("//*[name()='svg']")).click();
	}

}
