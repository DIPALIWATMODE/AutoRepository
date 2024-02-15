package String_m;

public class String_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String s="Dipali+$%#@$7yygdrdrSghJjhxcvbKJnm";
				String s1="Watmode";
//				String s1 =new String(s);
//				System.out.println(s);
//				System.out.println(s1);
				
				System.out.println(s.concat(s1));
				System.out.println(s.charAt(4));
				System.out.println("============");
				for (int i=2;i<6;i++) {
					System.out.println(i);
				}
				System.out.println("====================");
					for(int i=2;(i>1 && i<=6);i++) {
						System.out.println(i);
					}
					System.out.println(s.equals(s1));
					System.out.println(s.contains(s1));
					System.out.println(s.contentEquals(s1));
					System.out.println(s.indexOf('*'));
					System.out.println(s.indexOf('m'));
					int lastIndexValue =s.lastIndexOf('J');
					System.out.println(lastIndexValue);
					char[]ch= {'d','g','h','t','k'};
					String k =new String(ch);
					System.out.println(k);
					
					
					
					String d="dghtk";
					char[] charArrary= d.toCharArray();
					for(char ch1:charArrary) {
						System.out.print(ch1);
					}
					System.out.println();
				
	}

}
