package testNG6_DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUsingExcel {
	
	@DataProvider(name = "invalidlogincredentials")
	public String[][] dataProviderMethodUsingExcel() throws EncryptedDocumentException, IOException
	{	
		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("dwsinvalid");
		int rowCount = sheet.getPhysicalNumberOfRows() - 1;
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] arr = new String[rowCount][cellCount];
		
		for(int i=1; i<=rowCount; i++)
		{
			for(int j=0; j<cellCount; j++)
			{
				arr[i-1][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return arr;	
	}
  
  @Test(dataProvider = "invalidlogincredentials", dataProviderClass = testNG6_DataProvider.DataProviderUsingExcel.class)
  public void invalidLoginTC(String email, String password) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://demowebshop.tricentis.com/");
	 driver.findElement(By.linkText("Log in")).click();
	 driver.findElement(By.id("Email")).sendKeys(email);
	 driver.findElement(By.id("Password")).sendKeys(password);
	 driver.findElement(By.cssSelector("input[value='Log in']")).submit();
	 }
}
