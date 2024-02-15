package interface_1;

public class Imple_C implements Inter_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imple_C obj=new Imple_C();
		obj.blue();
		obj.pick(30);
		obj.red();
		
	}

	@Override
	public void pick(int x) {
		// TODO Auto-generated method stub
		System.out.println("run pick");
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("run red");
	}

	@Override
	public void blue() {
		// TODO Auto-generated method stub
		System.out.println("blue");
	}

	

}
