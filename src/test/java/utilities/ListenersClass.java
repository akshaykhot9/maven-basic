package utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.LoginTests;

public class ListenersClass extends LoginTests implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		System.out.println("Inside Listeners");
		try {
			ScreenShot.captureScreenShot(driver, name);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
