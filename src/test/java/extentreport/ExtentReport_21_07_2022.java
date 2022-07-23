package extentreport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport_21_07_2022 implements ITestListener {

	
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void OnStart(ITestContext testContext) {
		
		htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtReport.html");
		htmlreporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config1.xml");
		
		htmlreporter.config().setDocumentTitle("Extent Report");
		htmlreporter.config().setReportName("Automation Report");
		htmlreporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("TesterName", "Deba");
		extent.setSystemInfo("Browser", "Chrome");
	}
	
	public void OnTestSuccess(ITestResult itr) {
		test=extent.createTest(itr.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(itr.getName(), ExtentColor.GREEN));
		
	}
	public void OnFailuer(ITestResult itr) {
		test=extent.createTest(itr.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(itr.getName(), ExtentColor.RED));
	}
	public void OnTestSkipped(ITestResult itr) {
		test=extent.createTest(itr.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(itr.getName(), ExtentColor.ORANGE));
	}
	
	
	public void OnFinish(ITestResult itr) {
	extent.flush();
	}
	
}
