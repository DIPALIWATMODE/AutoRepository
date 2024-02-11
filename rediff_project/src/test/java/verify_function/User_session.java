package verify_function;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;



	public class User_session extends Base_class {
		@Test(priority=1)
		public void do_login() throws Throwable {
		//test=r.createTest("Verify search BOX");
			test.log(Status.INFO, "Login...");
			//Enter properties file String key is equal to chrome
			ap.open_browser("Chrombrowser");
			
			//Enter properties file String key is equal to https:money. rediff.com
		 	ap.navigate("rediffurl");
		 	ap.screenphoto("homepage");
		 	
		 	//Enter properties file String key is equal to sign In
		 	ap.click("Sign_xpath");
		 	
		 	ap.type("username_id", "username");//enter username
		 	ap.type("userpass_xpath", "userpass");//enter userpass
		 	ap.click("submitbutton_id");//click on sumit button
			System.out.println("do_login");
			
		}
  
		@Test(priority=2)
		public void do_logout() {
			System.out.println("do_logout");
			ap.click("singout_linktext");
		}
}
