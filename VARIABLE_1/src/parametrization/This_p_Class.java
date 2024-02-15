package parametrization;

public class This_p_Class {
	int A=3000;
	public This_p_Class() {
		
		System.out.println("1st class price 00");
		
	}
	public This_p_Class(int x) {
		this();
		
		System.out.println("5th class all Subject price="+A);
	}
	public This_p_Class(int x,String book) {
		this(10000);
		int B=25000;
		int C=50000;
		System.out.println("10th class all Subject price="+B);
		System.out.println("Total class book price="+C);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_p_Class obj =new This_p_Class(50000,"Totalbook");
	}

}
