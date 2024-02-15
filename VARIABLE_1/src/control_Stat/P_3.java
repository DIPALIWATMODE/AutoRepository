package control_Stat;

public class P_3 {
   	int a=11;
   	int b=2;
   	int c=10;

		public  void dipa() {
			P_3 obj =new P_3();
			System.out.println(obj.c);
		if(a<b)	{
			System.out.println("A");
		
		if(a>c) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}}else{
			System.out.println("sencond run");
		}if(c==b){
			System.out.println("E");
		}else {
			System.out.println("F");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3 obj =new P_3();
         obj. dipa()  ;    	
       //  obj.dish();
	}
			public void dish() {
				P_3 obj =new P_3();
				System.out.println(obj.c);
				if(a<c) {
					System.out.println("test 1 pass");
				}else if(b<c) {
					System.out.println("test 2 pass");
				}else if(c==b) {
					System.out.println("test 3 pass");
				}else {
					System.out.println("test 4 pass");
				}
					
				}
				
				
				
			
}
