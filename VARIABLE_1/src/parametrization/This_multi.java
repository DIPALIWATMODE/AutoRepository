package parametrization;

public class This_multi {
	
		public This_multi() {
			this(6);
			System.out.println("i am defined");
	}
		public This_multi(int a) {
			System.out.println("i am parameter");
	}
	
		public This_multi(int c,int d ) {
			this();
			System.out.println("two para");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_multi obj=new This_multi(5,8);
	}

}
