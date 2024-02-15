package polymorphism;

public class Overloading {
		public void A(double d) {
		System.out.println("zeox");
		}
//		public void A(int a) {
//			System.out.println("one");
//		}
		public void A(float b) {
			System.out.println("two");
			System.out.println(b);
			
		}	
		public void A(String c){
			System.out.println("string");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj =new Overloading();
		obj.A(55.6);
		obj.A(3);
		obj.A(30.40f);
		obj.A("dipa");
	}

}
