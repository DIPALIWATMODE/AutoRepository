package exception;

public class Customis_exp extends RuntimeException{
		public Customis_exp (String s) {
			super(s);
			
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		int i=10;
		
		throw new Customis_exp("fdfdshgvfetfeg");
		}

}
