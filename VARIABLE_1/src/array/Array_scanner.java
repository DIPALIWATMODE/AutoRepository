package array;

import java.util.Scanner;

public class Array_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your array size");
		int size= sc.nextInt();
		System.out.println("-------------------");
		int[] city=new int[size];
		
		for(int i=0;i<city.length;i++) {
			System.out.println(city[i]);
		}
	}

}
