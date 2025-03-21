package testNG5_Listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;
//There are multiple Listeners available in testNG, ITestListener is one of them
//ITestListener - is an Interface which has 8 Non-static methods without implementation-
//- so we are providing implementation by creating MyListeners class- and overriding those methods from this class

//Need to create Normal Class, do not create TestNG class as - MyListerner
public class MyListeners extends BaseTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("--Test started --" + result.getName(), true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("--Test successed --" + result.getName(), true);
	}

	@Override
	public void onTestFailure(ITestResult result)  //result variable- will get method name input from class- where MyListeners class is used as Listener
	{   
		 String failedMethodName = result.getName();   //getName()- will give name of method(test case) which is getting failed
		 
		 LocalDateTime ldt = LocalDateTime.now();
		 String timeStamp = ldt.toString().replaceAll(":", "-");
		 
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File source= ts.getScreenshotAs(OutputType.FILE);
		 File destination = new File("./errorshots/" + failedMethodName + timeStamp + ".png");
		 try {
			Files.copy(source, destination);   //use Files class from com.google.common.io.files or use FileHandler class 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("--Test skipped --" + result.getName(), true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("--Test failed but within success percentage --" + result.getName(), true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("--Test failed but with timeout --" + result.getName(), true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("<test>--" + context.getName() + "started", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("<test>--" + context.getName() + "finished", true);
	}
	
}
