package polymorphism;
class m{
	
	public void dipa() {
		System.out.println(" dipa run");
	}
	
}
public class Com extends m {
	public void dipa() {
		System.out.println("dipa not run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Com obj=new Com();
		obj.dipa();
	}

}
