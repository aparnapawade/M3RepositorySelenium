package testNG1_HelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstandDependsOnMethod {
	
	//dependsOnMethods -- is a helper attribute
 
	 @Test(dependsOnMethods = "register")
	  public void login() 
	  {
		  Reporter.log("This is login method", true);
	  }
	  
	 @Test
	  public void register() 
	  {
		  Reporter.log("This is register method", true);
	  }
	 
	 @Test(dependsOnMethods = "login")
	  public void checkAccountBalance() 
	  {
		  Reporter.log("This is checkAccountBalance method", true);
	  }
	 
	 @Test(dependsOnMethods = {"login", "moneyTransfer"})
	  public void logout() 
	  {
		  Reporter.log("This is logout method", true);
	  }
	 
	 @Test(dependsOnMethods = {"login", "register"})
	  public void moneyTransfer() 
	  {
		  Reporter.log("This is moneyTransfer method", true);
	  }
}
/* Output
 This is register method
This is login method
This is checkAccountBalance method
This is moneyTransfer method
This is logout method
 */
