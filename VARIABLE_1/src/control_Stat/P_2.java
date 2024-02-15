package control_Stat;

public class P_2 {
    
	public void mina() {
		int a=15;
	    int b=7;
	    int c=5;
	    
	    if(a>b) {
	if(a>c) {
			System.out.println("a is largest");
		}else {
			System.out.println("c is largest");
		}
	    }else {
	    	System.out.println("2 condition run");
	    }if(b>c) {
	    	System.out.println("b is largest");
	    }else {
	    	System.out.println("c is largest");
	    }
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_2  obj=new P_2 ();
		obj.mina();
	}

}
