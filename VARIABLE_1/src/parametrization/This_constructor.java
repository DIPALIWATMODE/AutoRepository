package parametrization;

public class This_constructor {
		public This_constructor() {
			System.out.println("hellow user d");
		}
		public This_constructor(int x) {
			this();
			System.out.println("value"+x);
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_constructor obj=new This_constructor(34);
		
	}

}
