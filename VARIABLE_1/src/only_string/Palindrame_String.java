package only_string;

public class Palindrame_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="NITIN";
		String B="";
		 for (int i=A.length()-1;i>=0;i--) {
			 B=B+A.charAt(i);
		 }
		 System.out.println("Original string="+A);
		 System.out.println("Original string="+B);
			
		 if(A.equalsIgnoreCase(B)) {}
		 System.out.println();
	}

}
