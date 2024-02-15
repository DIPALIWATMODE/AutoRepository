package array;

import java.util.Scanner;

public class Multi_without_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=3;
		int c=4;
		int[][] X= new int[r][c];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER MULTI SIZE");
		
				for(int i=0;i<X.length;i++) {
					for(int j=0;j<X.length;j++) {
						X[i][j]=sc.nextInt();
					}
					for(int i1=0;i1<X.length;i1++) {
						for(int j=0;j<X.length;j++) {
							System.out.print(X[i][j]);
						}
						System.out.println();
					}
					
//			for(int e=0;e<ok;e++) {
//		jje[x]=sc.nextDouble();
//		
//			}
			
		}


	}

}
