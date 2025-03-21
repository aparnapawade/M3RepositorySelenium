package testNG1_HelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicAndToUnderstandPriority {
 
  //If have more than one @Test methods(test cases) in the same class(TestNG class) 
  //--it will get execute in alphabetical order as they will be default assigned with priority=0
  //We have multiple Helper attributes -- priority is one among it --which is used to set the priority of the methods to execute accordingly
  //We can set priority in Integer -- Negative or Positive 
  //Lesser integer value >> Higher execution priority-- will execute first
  //Higher integer value >> Lower execution priority -- will execute later
  
	 @Test(priority = 2)
	  public void login() 
	  {
		  Reporter.log("This is login method", true);
	  }
	  
	 @Test(priority = 1)
	  public void register() 
	  {
		  Reporter.log("This is register method", true);
	  }
	 
	 @Test(priority = 3)
	  public void checkAccountBalance() 
	  {
		  Reporter.log("This is checkAccountBalance method", true);
	  }
	 
	 @Test(priority = 4)
	  public void logout() 
	  {
		  Reporter.log("This is logout method", true);
	  }
}


/* == Output with default priority=0 ==
This is checkAccountBalance method
This is login method
This is logout method
This is register method
 */

/* == Output by setting the priority as per need ==
This is register method
This is login method
This is checkAccountBalance method
This is logout method
 */


