package interface_1;

public class ImpleA implements InterA 	 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpleA obj=new ImpleA();
		obj.V3();
		obj.V4();
		obj.V5();
	}

	@Override
	public void V3() {
		// TODO Auto-generated method stub
		System.out.println("A");
	}

	@Override
	public void V4() {
		// TODO Auto-generated method stub
		System.out.println("B");
	}

	@Override
	public void V5() {
		// TODO Auto-generated method stub
		System.out.println("C");
	}

}
