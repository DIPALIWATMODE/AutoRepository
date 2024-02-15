package casting;

public class Casting_2 extends Casting_1 {
	public void D() {
		System.out.println("D is run");
	}public void E() {
		System.out.println("E is run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casting_2 obj =new Casting_2();
		obj.A();
		obj.B();
		obj.C();
		Casting_1 obj2 =new Casting_1();
		obj.A();
		obj.B();
	}

}
