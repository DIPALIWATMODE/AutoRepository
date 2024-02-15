package control_Stat;

import java.util.Scanner;

public class Scannerc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);//user kdun input
		int A ;
		int B;
		int C;
		int D;
		System.out.println("Enter a fist number");
		A=sc.nextInt();
		System.out.println("Enter a second number");
	    B=sc.nextInt();
		System.out.println("Enter a third number");
		C=sc.nextInt();
		D=A+B+C;
		System.out.println("addition of three number =" +D);
	}

}
