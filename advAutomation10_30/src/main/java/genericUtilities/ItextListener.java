package genericUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
/**
 * @author ANAND PRASANTHI
 */
public class ItextListener extends BaseClass implements ITestListener {
	ExtentReports report;
	
	
	@Override
	public void onTestStart(ITestResult result) {
		logger=report.createTest(result.getName());
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS,"This test"+result.getName()+" is passed");		

			}

	@Override
	public void onTestFailure(ITestResult result) {
		
		logger.addScreenCaptureFromPath(screenshot.capturingScreenshot(result.getName()));	
	}
	
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ExtentSparkReporter reporter=new ExtentSparkReporter("./report/demoreport.html");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setDocumentTitle("this is my sample report");
		reporter.config().setReportName("my name is selenium");
		 report=new ExtentReports();
		report.attachReporter(reporter);

		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		

}
}