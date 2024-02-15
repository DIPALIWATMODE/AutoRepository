package control_Stat;

import java.util.Scanner;

public class M_H5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a;
		int num1,num2,Result;

		Scanner sc= new Scanner(System.in);
		System.out.println("Choose an Operator from give:+,-,* or ");
		a=sc.next().charAt(0);
		System.out.println("Enter 1 st number");
		num1=sc.nextInt();
		System.out.println("Enter 2 st number");
		num2=sc.nextInt();

		switch(a) {
		case '+':		
			Result=num1+num2;
			System.out.println(num1+ "+"  +num2 + "=" +Result);
			break;
		case '-':		
			Result=num1-num2;
			System.out.println(num1+ " - "+num2 + " = " +Result);
			break;
		case '*':		
			Result=num1*num2;
			System.out.println(num1+ " * "+num2 + " = " +Result);
			break;
		case '/':		
			Result=num1/num2;
			System.out.println(num1+ " / "+num2 + " = " +Result);
			break;
			default:
				System.out.println("Invalid Opertor");
		}  

	}

}
