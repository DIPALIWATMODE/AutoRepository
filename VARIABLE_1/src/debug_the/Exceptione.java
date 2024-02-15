package debug_the;

public class Exceptione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X=50;
		int Y=10;
		int Z=X/Y;
		try {
			
			Z=X/Y;
		
		System.out.println(Z);
		
	}catch(Exception e) {
		System.out.println("can't handle operation");
		System.out.println("HI");
	}
		finally {
			System.out.println("Allways run");
		}
	}
	}


