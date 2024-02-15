package loop;

public class Self {
public static void main(String[] args) {
	
//	for(int i=1;i<=10;i++) {
//		System.out.print(3*i);
//	}
//	
	for(int x=1;x<20;x++) {
		if(x%2==0) {
			System.out.println("your even no="+x);
		}
		
	}
	System.out.println("===============================");
	for(int x=1;x<20;x++) {
		if(x%2!=0) {
			System.out.println("your even no="+x);
		}
	}
	System.out.println("=================================");
	for(int x=1;x<20;x++) {
		if(x%2==1) {
			System.out.println("your even no="+x);
		}
	}
}
}
