package exception;

public class Throw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=20;
		if(i<20) {
			throw new ArithmeticException(" me Arithematical exceptio");
		}
		else {
			throw new ArrayIndexOutOfBoundsException(" me out of");
		}
	}

}
