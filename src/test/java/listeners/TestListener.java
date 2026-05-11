package listeners;

import base.BaseTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utilities.Screenshot;

public class TestListener extends BaseTest implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        Screenshot.captureScreenshot(driver, result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }
}