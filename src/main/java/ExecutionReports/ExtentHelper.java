package ExecutionReports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentHelper {

    private static ExtentReports extent= null;
    private static ExtentTest test= null;

    private ExtentHelper(){

    }
    public  static ExtentTest getTest(){
        return test;
    }
    public  static void setTest(ExtentTest testPrd){
       test=testPrd;
    }

    public static ExtentReports getInstance(){
        if(extent==null){
           extent= createIntance();
        }
        return extent;
    }

    private static ExtentReports createIntance() {
      String  reportPath = System.getProperty("user.dir")+"\\ExecutionResults\\ExecutionResults.html";
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.config().setDocumentTitle("Automation-Execution-Report");
        extent=new ExtentReports();
        extent.attachReporter(sparkReporter);
        return extent;
    }
}
