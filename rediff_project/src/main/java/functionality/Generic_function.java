package functionality;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Generic_function {
	public WebDriver driver;
	
	public String projectpath=System.getProperty("user.dir");
	public Properties envprop;
	public Properties uatprop;
	public Properties locatorprop;
	public FileInputStream fis;
	public ExtentTest test;

	public void open_browser(String browser) {
		System.out.println("Lunch Browser Is_" + uatprop.getProperty(browser));	
		//to generte 
		test.log(Status.INFO, "Lauch Browser is:-"+ uatprop.getProperty(browser));
		
		if(uatprop.getProperty(browser).equalsIgnoreCase("Chrome") ) {
			driver=new ChromeDriver();
		}else if(uatprop.getProperty(browser).equalsIgnoreCase("firefox") ) {
			driver=new FirefoxDriver();
		}else if(uatprop.getProperty(browser).equalsIgnoreCase("edg")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void navigate(String url) { 
	System.out.println("Navigated URl is "+uatprop.getProperty(url));
	 
		driver.get(uatprop.getProperty(url));
		
	}
	public void click(String locator) {
		//here click is performed on element
		//which came from get Element and by locator metho
		System.out.println(locatorprop.getProperty(locator));
		getElement(locator).click();
	}
	public void getText() {
		
		
	}
	public void selection(String locator,String option) {
		
		
	}
	public void type(String locator,String Input_text) {
		getElement(locator).sendKeys(uatprop.getProperty(Input_text));
	}
	public void clear(String locator) {
		getElement(locator).clear();
	}
	public WebElement getElement(String locatorKay) {
		WebDriver deiver;
		
		//Method Purpose =to find Webelement 
		WebElement element=null;
		 element=driver.findElement(getLocateor(locatorKay));
		return element;//Above method method return Web Element reference variable
	}
	
	
	public By getLocateor(String locatorKey) {
		//Method Purpose =To Location Web Element With help of
		//any type of location
		By by=null;//First Time It will null and it Return By class
		
		
		//Here locator is coming from locator properties file
		if(locatorKey.endsWith("_id")) {
			by=By.id(locatorprop.getProperty(locatorKey));
			
		}else if(locatorKey.endsWith("_name")) {
			by=By.name(locatorprop.getProperty(locatorKey));
			
		}else if(locatorKey.endsWith("_classname")) {
			by=By.className(locatorprop.getProperty(locatorKey));
			
		}else if(locatorKey.endsWith("_linktext")) {
			by=By.linkText(locatorprop.getProperty(locatorKey));
			
		}else if(locatorKey.endsWith("_partiallintext")) {
			by=By.partialLinkText(locatorprop.getProperty(locatorKey));
			
		}else if(locatorKey.endsWith("_cssSelector")) {
			by=By.cssSelector(locatorprop.getProperty(locatorKey));
			
		}else if(locatorKey.endsWith("_xpath")) {
			by=By.xpath(locatorprop.getProperty(locatorKey));
		}
		return by;//	Return By class Variable
		
	}
	
}
