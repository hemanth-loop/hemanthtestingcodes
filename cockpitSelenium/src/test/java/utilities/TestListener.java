package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    public  void onStart(ITestContext context) {
        System.out.println("test execution is started...........");
    }
    public void onTestStart(ITestResult result) {
        System.out.println("test started..........");
    }
    public void onTestSuccess(ITestResult result) {

        System.out.println("✅ TEST PASSED: " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("❌ TEST FAILED: " + result.getName());

        Throwable exception = result.getThrowable();
        if (exception != null) {
            System.out.println("Reason: " + exception.getMessage());
        }
    }
    public void onTestSkipped(ITestResult result) {
        System.out.println("test  skipped");
    }
    public void onFinish(ITestContext context) {
        System.out.println("test execution is compleated");
    }


}
