package listeners;

import com.gurock.testrail.TestRailConnector;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ui.steps.login.defLoger.TestLoger;

public class CustomListener implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {
        TestLoger.startTestcase((iTestResult.getMethod().getDescription()));

    }

    public void onTestSuccess(ITestResult iTestResult) {

        int resultid =1;
        String comment = "TEST PASSED " + iTestResult.getName() + "\n";
        String testCaseid = iTestResult.getMethod().getDescription();

        long duration = (iTestResult.getEndMillis() - iTestResult.getStartMillis())/1000;
        TestRailConnector testRailConnector = new TestRailConnector("https://itstep092018.testrail.io",
                "Hadleuski81@gmail.com", "Icanall81");
        testRailConnector.sendTestResult(testCaseid,resultid,comment,duration,"12");
    }

    public void onTestFailure(ITestResult iTestResult) {
        int resultid =5;
        String comment = "TEST FAILED" + iTestResult.getName() + "\n";
        String testCaseid = iTestResult.getMethod().getDescription();

        long duration = (iTestResult.getEndMillis() - iTestResult.getStartMillis())/1000;
        TestRailConnector testRailConnector = new TestRailConnector("https://itstep092018.testrail.io",
                "Hadleuski81@gmail.com", "Icanall81");

        testRailConnector.sendTestResult(testCaseid,resultid,comment,duration,"12");
    }

    public void onTestSkipped(ITestResult iTestResult) {

        int resultid =2;
        String comment = "TEST BLOCKED" + iTestResult.getName() + "\n";
        String testCaseid = iTestResult.getMethod().getDescription();

        long duration = (iTestResult.getEndMillis() - iTestResult.getStartMillis())/1000;
        TestRailConnector testRailConnector = new TestRailConnector("https://itstep092018.testrail.io",
                "Hadleuski81@gmail.com", "Icanall81");
        testRailConnector.sendTestResult(testCaseid,resultid,comment,duration,"12");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {


    }

    public void onFinish(ITestContext iTestContext) {

    }
}
