package org.assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAvoidFileUploadPopupInShine {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shine.com/registration/");
		driver.findElement(By.id("id_file")).sendKeys("C:/Users/Aparna Deshmukh/Downloads/Aparna_Deshmukh_Resume.pdf");
	}

}
