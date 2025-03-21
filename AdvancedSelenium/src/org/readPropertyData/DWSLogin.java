package org.readPropertyData;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSLogin implements IAutoConstant {

	public static void main(String[] args) throws IOException {
	Flib flib = new Flib();
	String url	= flib.readDataFromPropertyFile(prop_path, "url");
	String email = flib.readDataFromPropertyFile(prop_path, "email");
	String password = flib.readDataFromPropertyFile(prop_path, "password");
		
//		//To specify path of property file
//		FileInputStream fis = new FileInputStream("./testData/config.properties");
//		//To load the keys and make the file ready to read
//		Properties prop = new Properties();
//		prop.load(fis);
//		String email = prop.getProperty("email");
//		String password = prop.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
