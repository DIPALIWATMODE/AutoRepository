package only_string;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="radha";
		String B="";
//		for(int i=0;i<=10;i++) {
//			System.out.println(i);
			
		for(int i=A.length()-1;i>=0;i--){
			B=B+A.charAt(i);
		}
		System.out.println("Original string="+A);
		System.out.println("Original string="+B);
	}

}
