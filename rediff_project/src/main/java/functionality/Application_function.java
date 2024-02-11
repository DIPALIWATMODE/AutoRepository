package functionality;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Application_function extends Validation_function{
	public String projectpath=System.getProperty("user.dir");
	public Properties envprop;
	public Properties uatprop;
	public Properties locatorprop;
	public FileInputStream fis;
		public Application_function() throws Throwable {
			//Initialize Environment properties file_1
			fis=new FileInputStream(projectpath+"\\src\\test\\resources\\environment.properties");
			envprop=new Properties();
			envprop.load(fis);
			
			//Initialize UAT propertiesFile_2
			fis=new FileInputStream(projectpath+"\\src\\test\\resources\\UAT.properties");
			uatprop=new Properties();
			uatprop.load(fis);
			//uatprop.getProperty(projectpath);
			
			//Initialize Locator properties File_3
			fis=new FileInputStream(projectpath+"\\src\\test\\resources\\locators.properties");
			locatorprop=new Properties();
			locatorprop.load(fis);
		}
		public void screenphoto(String screenshotnamr) throws Exception{
			File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("..//rediff_project/Screenphotocopy"+projectpath+".png"));
		}
		public ExtentReports create_extent_report() {
			//  String path=System.getProperty("user.dir");
			  ExtentSparkReporter report=new ExtentSparkReporter(projectpath+"\\Report\\Rediff.html");
			  //System.out.println(path);
			  report.config().setDocumentTitle("Automation Report");
			  report.config().setReportName("Function Testing");
			  report.config().setTheme(Theme.STANDARD);
			  
			  //Attach report
			  ExtentReports rep=new ExtentReports();
			  rep.attachReporter(report);
			  
			  //Name of OS
			  rep.setSystemInfo("OS", "Window");
			  
			  //Name of QA
			  rep.setSystemInfo("QA", "dipali watmode");
			  
			  //Name of Browser
			  rep.setSystemInfo("Browser", "Chrome");
			  rep.createTest(projectpath);
			  return rep;
		}
}
