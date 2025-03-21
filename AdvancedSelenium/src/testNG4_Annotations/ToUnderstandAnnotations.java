package testNG4_Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToUnderstandAnnotations {
	
  @BeforeMethod    //Login
  public void beforeMethod() 
  {
	  Reporter.log("I am from BeforeMethod Annotation", true);
  }
  
  @AfterClass   //Close browser -quit driver session
  public void afterClass() 
  {
	  Reporter.log("I am from AfterClass Annotation", true);
  }
  
  @BeforeTest  //Preconditions
  public void beforeTest() 
  {
	  Reporter.log("I am from BeforeTest Annotation", true);
  }
  
  @AfterSuite  //Close connections with Database and Flush all reports
  public void afterSuite() 
  {
	  Reporter.log("I am from AfterSuite Annotation", true);
  }
  
  @Test
  public void test1() 
  {
	  Reporter.log("I am from Test -1 Annotation", true);
  }
   
  @AfterMethod  //Logout
  public void afterMethod() 
  {
	  Reporter.log("I am from AfterMethod Annotation", true);
  }
  
  @BeforeClass  //Browser - Maximize - Implicitly wait - URL
  public void beforeClass() 
  {
	  Reporter.log("I am from BeforeCLass Annotation", true);
  }
  
  @AfterTest  //Post conditions
  public void afterTest() 
  {
	  Reporter.log("I am from AfterTest Annotation", true);
  }
  
  @Test
  public void test2() 
  {
	  Reporter.log("I am from Test -2 Annotation", true);
  }
  
  @BeforeSuite //establish connections with Database using JDBC - config reports
  public void beforeSuite() 
  {
	  Reporter.log("I am from BeforeSuite Annotation", true);
  }
}
/*
I am from BeforeSuite Annotation
I am from BeforeTest Annotation
I am from BeforeCLass Annotation
I am from BeforeMethod Annotation
I am from Test -1 Annotation
I am from AfterMethod Annotation
I am from BeforeMethod Annotation
I am from Test -2 Annotation
I am from AfterMethod Annotation
I am from AfterClass Annotation
I am from AfterTest Annotation
I am from AfterSuite Annotation
*/
