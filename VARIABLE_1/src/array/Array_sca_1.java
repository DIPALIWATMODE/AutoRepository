package array;

import java.util.Scanner;

public class Array_sca_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your array size");
		int size= sc.nextInt();
		
		int[] city=new int[size];
		System.out.println("Enter your array value");
			for (int x=0;x<size;x++) {
				city[x]=sc.nextInt();
			}
		System.out.println("----------------");
		
		for(int i=0;i<city.length;i++) {
			System.out.println(city[i]);
		}
	}

}
