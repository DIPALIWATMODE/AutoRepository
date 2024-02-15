package parametrization;

public class This_MInvoke {
		public void display() {
			int s=30;
			System.out.println(s);}
			
		public void get() {
			this.display();
			System.out.println("i am get method");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_MInvoke obj=new This_MInvoke();
		obj.get();
	}

}
