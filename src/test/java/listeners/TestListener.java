package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.ExtentManager;
import utilities.Screenshot;   // ADD HERE
import base.BaseTest;

import static base.BaseTest.driver;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentManager.getReport();

    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {

        test = extent.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.pass("Test Passed");
    }

    @Override

    public void onTestFailure(ITestResult result) {

        test.fail("Test Failed");

        String screenshotPath =
                Screenshot.captureScreenshot(
                        BaseTest.driver,
                        result.getName()
                );

        try {

            test.addScreenCaptureFromPath(screenshotPath);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();
    }
}