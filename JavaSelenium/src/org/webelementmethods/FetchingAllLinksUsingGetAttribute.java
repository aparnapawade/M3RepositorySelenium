package org.webelementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingAllLinksUsingGetAttribute {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.facebook.com/");
		  
		  List<WebElement> allLinks = driver.findElements(By.xpath("//a[@href]"));
		  
		  //Fetching the size of allLinks using size() --- which is the collection<I> method inherited into List<I>
		  System.out.println(allLinks.size());
		  
		  //Fetching one one link from all links to print the links directly 
		  for( WebElement link : allLinks)
		  {
			  String hrefValue = link.getAttribute("href");
			  System.out.println(hrefValue);
		  }
	}

}
