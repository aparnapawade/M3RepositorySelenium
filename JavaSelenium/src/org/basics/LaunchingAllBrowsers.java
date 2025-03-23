package org.basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingAllBrowsers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the browser name you want to launch: ");
	    String browsername = sc.next();
	    WebDriver driver = null;
	    if(browsername.equalsIgnoreCase("chrome"))
	    {
	    	driver = new ChromeDriver();
	    }
	    else if(browsername.equalsIgnoreCase("edge"))
	    {
	    	driver = new EdgeDriver();
	    }
	    else
	    {
	    	System.err.println("Invalid Browser");
	    }
	    driver.get("https://www.selenium.dev/");
	    sc.close();
	}
}
