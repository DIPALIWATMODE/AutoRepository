package String_m;

public class String_nonConstant {
	
	private static String[] splittedString;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h=" dipali  gjkii";
		String A="Dipali";
		String B="DIPALI";
		String A1 ="watmode";
		//String B1 ="i am happy ";
		System.out.println(B.endsWith("e"));
		System.out.println(A1.endsWith("e"));
		System.out.println(A.startsWith(A1));
		System.out.println(A.startsWith("D"));
		System.out.println("========");
		System.out.println(B.indexOf('L'));
		//System.out.println(B.indexOf(3));
		System.out.println(A.replace("D","Y"));
		System.out.println("============");
		System.out.println(A1.substring(3));
		//String[]splitt=B1.split("");
		System.out.println(h.trim());
	
			}

}
