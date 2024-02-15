package control_Stat;

import java.util.Scanner;

public class M_H3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab;
		int num1,num2,Result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose an Operator from give:a+b,a-b,a*b or a/b");
		ab=sc.nextLine();
		System.out.println("Enter 1 st number");
		num1=sc.nextInt();
		System.out.println("Enter 2 st number");
		num2=sc.nextInt();
		
		switch(ab) {
		case "a+b":		
			Result=num1+num2;
			System.out.println(num1+ " + "+num2 + " = " +Result);
			break;
		case "a-b":		
			Result=num1-num2;
			System.out.println(num1+ "- "+num2 + " = " +Result);
			break;
		case "a*b":		
			Result=num1*num2;
			System.out.println(num1+ " * "+num2 + " = " +Result);
			break;
		case "a/b":		
			Result=num1/num2;
			System.out.println(num1+ " / "+num2 + " = " +Result);
			break;
			default:
				System.out.println("Invalid Opertor");



			
			}


	}

}
