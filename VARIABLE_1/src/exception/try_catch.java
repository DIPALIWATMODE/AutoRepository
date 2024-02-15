package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class try_catch {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		try {
		FileInputStream fd=new FileInputStream("");
		}catch(FileNotFoundException e) {
			System.out.println("Catch Block");
			e.printStackTrace();
		}
		try {
			FileInputStream fd=new FileInputStream("");
			
		}catch(Exception e) {
			Thread.sleep(2000);

			System.out.println("catch bbbb");
			e.getMessage();		}
		//Thread.sleep(2000);
	}

}
