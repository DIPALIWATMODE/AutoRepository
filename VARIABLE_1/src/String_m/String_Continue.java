package String_m;

public class String_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="Dipali";
		String A1="dipali";
		String B="watmode";
		String B1="WATMode";
		String C="";
//		System.out.println(A.concat(B));
//		System.out.println(A.concat("wanjare"));
//		System.out.println(A+B+3);
//		System.out.println(A+"=IS CUTE G");
//		System.out.println(A.charAt(5));
//		System.out.println(B.equals(B1));
//		System.out.println(A==B);
//		System.out.println(B==B1);
//		System.out.println(A.equalsIgnoreCase(A1));
//		System.out.println(B1.contains("m"));
//		System.out.println(A.contains("g"));
		System.err.println(A.substring(2));
		System.out.println(B1.substring(3, 5));
		System.out.println(B1.substring(2,4));
		System.out.println(A1.indexOf('l'));
		System.out.println(A.lastIndexOf('i'));
		System.out.println(A1.replace("d", "g"));
		System.out.println(A1.replace("pali", "cali"));
		System.out.println(B1.length());
		System.out.println(A.contentEquals(A));
		System.out.println(A.contentEquals(A1));
		System.out.println(A.toUpperCase());
		System.out.println(B1.toLowerCase());
		System.out.println(A.trim());
		System.out.println("=====================");
		char[] ch= {'W','A','T','M','O','D','E'};
		System.out.println(ch);
		System.out.println("=====================");
		String d="STPIFOTECH";
		char[] charArrary=d.toCharArray();
		for(char h:charArrary) {
			System.out.println(h);
		}
		System.out.println("------------");
		String S="STPIFOTECH";
		char[] charArrary1 = S.toCharArray();
		for(char u:charArrary1) {
			System.out.print(u);
		}
		System.out.println();
		
		System.out.println("=====================");
		System.out.println(A.toCharArray());
		
		String Z="HI DIPALI WELL COME TO YOU";
		System.out.println(B.split(Z));
		System.out.println(A.isEmpty());
		System.out.println(C.isEmpty());
		
		
		
		
		
		
		
		

	}

}
