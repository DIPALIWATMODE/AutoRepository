package array;

import java.util.Scanner;

public class Array_sca2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Array Size");
		int	size = sc.nextInt();
		double[]age=new double[size];
		
		for(int i=0;i<size;i++) {
			age[i]=sc.nextDouble();
		}
	System.out.println("---------------");
	
	for(int x=0;x<size;x++) {
		System.out.println(age[x]);
	}
	}

}
