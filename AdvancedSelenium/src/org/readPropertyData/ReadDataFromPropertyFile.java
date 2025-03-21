package org.readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//To specify the location of the file
		FileInputStream fis = new FileInputStream("./testData/config.properties");
		
		//To make the file ready to read
		Properties prop = new Properties();
		prop.load(fis);
		
		//To read/fetch the data from property file
		String urlData = prop.getProperty("url");
		System.out.println(urlData);
	}

}
