package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener1 implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Finished");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}
	
	//Will be called in different class with annotation @Listener(packagename.classname.class)
	

}
