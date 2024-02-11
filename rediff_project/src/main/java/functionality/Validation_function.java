package functionality;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Validation_function extends Generic_function{

	public void validate_title() {
		
	}
	public void validte_text() {
		
	}
	public void validate_element() {
	
}
public void screenphoto(String screenshotnamr) throws Exception{
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("..//rediff_project/Screenphotocopy"+projectpath+".png"));
	}
}
