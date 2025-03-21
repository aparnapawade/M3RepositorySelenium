package org.readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");  //To specify the path of the file
		Workbook wb = WorkbookFactory.create(fis); //To make the file ready to read
		Sheet sheet = wb.getSheet("ipl"); //To go to desired sheet
		Row row = sheet.getRow(1);   //To go to desired row
		Cell cell = row.getCell(0);  //To go to desired cell/column
		String data = cell.getStringCellValue();  //To read the data from desired cell/column
		System.out.println(data);
		
	}

}
