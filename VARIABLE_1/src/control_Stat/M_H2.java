package control_Stat;

import java.util.Scanner;

public class M_H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);//user kdun input
		System.out.println("Enter like collection of money");

		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=A+B;
		System.out.println("Enter like collection of book");
		C=sc.nextInt();
				 switch(C) {
			  case 1: System.out.println(A*B+"= 1sem collection of Book ");
			        break;
			  case 2: System.out.println(C+A+"= 2sem collection of Book");
			        break;
			  case 3: System.out.println(A-C+"= 3sem collection of Book");
			        break;
			  case 4:System.out.println(A+C+" = 4sem collection of Book");
			        break;
			  case 5:System.out.println(6*1+" = 5sem collection of Book");
			        break;
			  case 6:System.out.println(9/2+" = 6sem collection of Book");
			        break;
			     default: System.out.println(" BIG collection of Book");
					
			        }
					
		
            }
	}

         

