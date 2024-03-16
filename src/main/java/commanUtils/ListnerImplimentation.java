package commanUtils;
import java.util.Random;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ListnerImplimentation implements ITestListener{
	ExtentSparkReporter reporter;
	ExtentReports report;
	ExtentTest test;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	}
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestStart(result);
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+" "+"Execution is start",true);
		report.createTest(methodName);
		test.log(Status.PASS,"test execution pass");
		test.log(Status.PASS,"test execution pass");
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
		System.out.println("Test execution is started");
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+" "+"Execution is pass",true);
		test.log(Status.PASS,methodName);
	//	test.log(Status.PASS,"test execution pass");
		test.log(Status.PASS,"test execution pass");
		//WebDriver util=new 
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
		String massege = result.getThrowable().toString();
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"Execution is fail"+massege );
		test.log(Status.PASS, "is pass");
		test.log(Status.PASS,methodName);
		test.log(Status.PASS,"test execution pass");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+" "+"Execution is skipp",true);
		test.log(Status.PASS,"test execution pass");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}
	@Override
	public void onStart(ITestContext context) {
		JavaUtils jutil=new JavaUtils();
		Random r=new Random();
		
	//	int ran = r.nextInt(100);
		//return ran;
		//TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
		//create onject of ExtentSparkReporter
		reporter=new ExtentSparkReporter("./extentreport/report.html");
		reporter.config().setDocumentTitle("vtigercrm");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Sahilkonknai");
		report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("os","windows");
		report.setSystemInfo("Browser", "chrome");
		report.setSystemInfo("chromversion", "121");
		report.setSystemInfo("Author","Sahil");
		//test.log(Status.PASS,"test execution pass");
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
		
		report.flush();
		}
}
