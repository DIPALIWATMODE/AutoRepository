package control_Stat;

public class IF_Else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int percent= 32;
            if(percent >=75) {
            	System.out.println("passed by distinction");
            }else if(percent >=60){
            	System.out.println("pass in 1st class");
            }else if(percent >=40) {
            	System.out.println("2nd  class");
            }else if(percent >=35){
            	System.out.println("3rd class");
            }else {
            	System.out.println("failed");
            }
	}

}
