package parametrization;

		public class Method_p1 {
	
				//method with argument and without return type
			    //value is not fixed
				public static void M1(int a,int b) {
						int c;
						c=a+b;
						System.out.println(c);
				
				}
				public static void main(String[] args) {
					// TODO Auto-generated method stub
							M1(15,10);
					Method_p1 obj=new Method_p1();
							obj.M2(3,8);
							//obj.M4();
							M3(468);
							int t=M4();
							System.out.println(t);
				}
				public  void M2(int D,int G) {
					int S;
					S = D*G;
					System.out.println(S);
				}
				public static int M3(int i) {
					return i;
					
					
				}
				public static int M4() {
					return 30;
				}
		}
