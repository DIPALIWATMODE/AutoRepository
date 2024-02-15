package polymorphism;

public class Overrinding2 extends Overriding {
	public void A(double d) {
		System.out.println("hi overriding 2 ");
		}
	public void A(int a) {
		System.out.println("not overriding 2 ");
		System.out.println(a);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overrinding2 obj=new Overrinding2();
		obj.A(39.88);
		obj.A(3);
	}

}
