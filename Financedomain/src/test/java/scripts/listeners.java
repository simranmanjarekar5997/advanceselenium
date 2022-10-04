package scripts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("test has been started",true);
	
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("test succeed",true);	
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("test failed",true);
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("test skipped",true);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("on Test Failed But Within Success Percentage",true);	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("on Test Failed With Timeout",true);
	}

	public void onStart(ITestContext context) {
		Reporter.log("test starts",true);
	}

	public void onFinish(ITestContext context) {
		Reporter.log("test has been finished",true);
	}
	
	

}
