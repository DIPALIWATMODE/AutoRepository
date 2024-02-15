package array;

import java.util.Scanner;
public class Multi_home5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] obj= {{1,4,8,9},{5,10,11,20},{6,9,12,14}};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Arrys size ");
	//	int  =sc.nextInt();
		for (int i=0; i<3;i++) {
			for(int j=0;j<4;j++) {
				obj[i][j]=sc.nextInt();
				//int[][] size1=new int[i][j];
			}
			System.out.println("===================");
			for(int l=0;l<obj.length;l++) {
				for(int T=0;T<4;T++) {
					System.out.println(obj[l][T]);
				}
			}
		}
		
	}

}
