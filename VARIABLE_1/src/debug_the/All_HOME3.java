package debug_the;

public class All_HOME3 extends All_HOME1  {

	public All_HOME3(int H) {
		super(H);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		All_HOME3 cc= new All_HOME3(23);
		cc.M2();
		cc.M1();
		cc.G();
		cc.D();
		int Y=10;
		int X=50;
		int Z=Y/X;
		try {
				Z=X/Y;
			System.out.println(X);
			System.out.println(Y);
			System.out.println(Z);
			
		}catch(Exception e) {
			System.out.println("can't handle operation");
		}
		finally {
			System.out.println("Allways run");
		}
		char[]ch= {'D','I','P','A','L','I'};
		String k =new String(ch);
		System.out.println(k);
	}
	public static void M1() {
		
		System.out.println("i am All home3 M1");
	}
	public void M2() {
		this.M3();
		System.out.println(" i am All home3 M2");
	}
	public void M3() {
		System.out.println("i am All home M3");
	}
	
}
