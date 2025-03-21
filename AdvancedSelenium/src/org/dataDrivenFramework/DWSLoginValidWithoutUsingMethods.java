package org.dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSLoginValidWithoutUsingMethods {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//To fetch Email and Password  from Excel file
		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("dwsvalid");
		Row row = sheet.getRow(1);
		//To fetch dws username from excel
		Cell cell = row.getCell(0);
		String email = cell.getStringCellValue();
		//To fetch dws password from excel
		Cell cell1= row.getCell(1);
		String password = cell1.getStringCellValue();      //or cell.toString()--will convert all type of data within excel to String
		
		//To fetch URL from property file
		FileInputStream fis1 = new FileInputStream("./testData/config.properties");
		Properties prop = new Properties();
		prop.load(fis1);
		String url = prop.getProperty("url");
		
		//To proceed to DWS Login using data from excel and property file
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	//	System.out.println(row.getLastCellNum());  //To get cell count in excel
	}

}
