package ExecutionReports;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomReporter implements ITestListener {


@Override
public void onTestSuccess(ITestResult result) {
        // not implemented


    ExtentHelper.getTest().assignCategory(result.getMethod().getRealClass().getSimpleName());
    ExtentHelper.getTest().pass(MarkupHelper.createLabel("Test passed ", ExtentColor.GREEN));
    }

    @Override

    public  void onTestFailure(ITestResult result) {
        // not implemented

        ExtentHelper.getTest().assignCategory(result.getMethod().getRealClass().getSimpleName());
        ExtentHelper.getTest().fail(result.getThrowable());
        ExtentHelper.getTest().fail(MarkupHelper.createLabel("Test Failed ", ExtentColor.RED));
        System.out.println("Test Failed :" +  result.getMethod().getMethodName());
    }

    @Override

   public  void onTestSkipped(ITestResult result) {
        // not implemented
        System.out.println("Test Sklipped");
    }
    @Override

   public  void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // not implemented
    }
    @Override


   public  void onTestFailedWithTimeout(ITestResult result) {
        onTestFailure(result);
    }


 public    void onStart(ITestContext context) {
        // not implemented
     System.out.println("Test Started");
     ExtentTest tt= ExtentHelper.getInstance().createTest("ExecutionStarted");
     ExtentHelper.setTest(tt);

    }

   public  void onFinish(ITestContext context) {
        // not implemented
       System.out.println("Test Completed");
       ExtentHelper.getInstance().flush();
    }

}
