package debug_the;

public class All_HOME1 implements All_HOME2{
	 int A=20;
 static	 int C=40;
 static	int B=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		All_HOME1 ob=new All_HOME1 (59);
		ob.M2();
		M1();

	}
		public static void M1() {
			System.out.println("Run m1 mthod");
			All_HOME1 ob= new All_HOME1 (80);
			System.out.println(ob.A);
			System.out.println(B);
			if(B>C && C>B) {
				System.out.println("B>C is less ");
			}else {
				System.out.println("C>B is greater ");
				
			}
		}
		public void M2() {
			System.out.println("Run m2 method");
			System.out.println(A);
			System.out.println(B);
			}
		
		public All_HOME1 (int H) {
			System.out.println("I AM PARAMETERIZED CONSTRUCTOR"+ H);
		}
		@Override
		public void D() {
			// TODO Auto-generated method stub
			System.out.println(" i am implements methods D");
		}
		@Override
		public void G() {
			// TODO Auto-generated method stub
			System.out.println(" i am implements methods G");

		}
		
		
		
		
		
		
		
		
}
