package verify_function;

import org.testng.annotations.Test;

public class Porfoli_Management extends Base_class {
  @Test(priority=1)
  public void create_portfolio() throws Exception {
	 System.out.println();
	 rep.createTest("create_portfolio");

	  ap.click("createportfolio_id");
	  ap.clear("portfolioname_cssSelector");
	  ap.type("portfolioname_cssSelector", "portfoliname");
	  ap.click("createportfoliobutton_id");
	
  }
  @Test(priority=2)
  public void delete_portfolio() {
	  System.out.println("delete");
	  
  }
  @Test(priority=3)
  public void update_portfolio() {
	  System.out.println("update");
  }
}
