package org.popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAvoidFileUploadPopupInNaukri {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//h2[contains(text(), 'experienced')]")).click();
		//FileUpload popup will be designed as: //input[@type = 'file'] using this need to locate the fileupload or use any valid attribute
		//Popup will not come--directly file will get upload using sendkeys()
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Aparna Deshmukh\\Downloads\\Aparna_Deshmukh_Resume.pdf");
	}

}
