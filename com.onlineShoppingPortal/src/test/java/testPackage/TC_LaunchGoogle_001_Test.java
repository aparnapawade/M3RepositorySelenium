package testPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_LaunchGoogle_001_Test {
	
  @Test
  public void launchGoogle() 
  {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.google.com/");
	driver.quit();
  }
}
//Use _Test suffix while giving the name to test case which we wants to run
//To execute all the test cases at a time--- run the pom.xml file -->Run as Maven test
//To run single test case --do through command prompt -->Click on pom.xml file then shown in system explorer -->click at the top where it is showing folder path
// -->type cmd and enter -->will open the command prompt --> then use the following commands as -->
// mvn -Dtest="packagename.classname" test       --> make sure don't give space between -Dtest and "packagename.classname"
// mvn test -Dtest="packagename.classname"       --> make sure don't give space between -Dtest and "packagename.classname"
