package verify_function;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import functionality.Application_function;

import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class Base_class {
	public Application_function ap;
	public ExtentReports rep;
	public ExtentTest test;
	
	
  @BeforeMethod
  public void beforeMethod(ITestContext context) throws Throwable {
	  //pass ap variable
	  ap=(Application_function)context.getAttribute("ap");
	  //pass test variable
	 test=(ExtentTest) context.getAttribute("test");
  }

  @BeforeTest
  public void beforeTest(ITestContext context) throws Throwable {
	  //Initialize Properties file Through Constructor
	 ap=new Application_function();
	 
	 //set ap reference variable(change ap 1 )
	 context.setAttribute("ap", "ap");
	 
	 //Initialize report
	 ap.create_extent_report();
	 context.setAttribute("test", test);
	 test =rep.createTest("DO Login");
	// test.log(Status.INFO, "beforeTest");
	   }
  @AfterTest
  public void aftertest() {
	  rep.flush();
	
}

}
