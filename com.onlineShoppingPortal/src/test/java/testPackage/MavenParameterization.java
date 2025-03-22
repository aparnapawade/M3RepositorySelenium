package testPackage;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenParameterization {
	
  @Test
  public void launchGoogleUsingMavenParameterization() 
  {		
	  	//System is a class present in java.lang package -- which has a static method getProperty()which accepts data in the form of String and return type is string
		//We will use this command to accept the data at Runtime through command prompt called as parameterization
		//To run this through command prompt -->Click on pom.xml file then shown in system explorer -->click at the top where it is showing folder path
		// -->type cmd and enter -->will open the command prompt --> then use the following commands as -->
		// mvn test -Dtest="testPackage.MavenParameterization" -Durl="https://www.google.com/" -DdataToBeSearched="https://www.selenium.dev/"
	  
	  	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String googleURL = System.getProperty("url");
		driver.get(googleURL);
		
		String data = System.getProperty("dataToBeSearched");
		driver.switchTo().activeElement().sendKeys(data, Keys.ENTER);;
  }
}
