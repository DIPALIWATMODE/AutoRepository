package exception;

public class Throw_key {

	public static void main(String[] args) throws  InterruptedException   {
		// TODO Auto-generated method stub
		int i=100;
		int j=0;
		System.out.println("throws exception in exception handling");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Thread.sleep(5000);
		int c=i/j;
		System.out.println(c);
	}

}
