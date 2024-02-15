package control_Stat;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String place="Home";
      String dish="bhindi";
      if(place=="Home") {
    	  System.out.println("food at home");
    	  if(dish=="bhindi") {
    		  System.out.println("bhindi");
    	  }else {
    		  System.out.println("gobi");
    	  } }else {
    	    	 System.out.println("food at hotel");
    	     if(dish=="fish") {
    	    	 System.out.println("fish to night");
    	     }else {
    	    	 System.out.println("chicken");
    	     }  }
    	}
	}


