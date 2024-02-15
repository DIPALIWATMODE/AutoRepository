package control_Stat;

import java.util.Scanner;

public class Scanner_switch {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner obj = new Scanner(System.in);//user kdun input

		int size;
		System.out.println(" Enter the size of T_shirt");
		size=obj.nextInt();
         switch(size) {
        case 28: System.out.println("size of T_shirt small");
        break;
         case 32: System.out.println("size of T_shirt medium");
        break;
      case 36: System.out.println("size of T_shirt large");
        break;
        case 40:System.out.println("size of T_shirt big large");
        break;
        case 42:System.out.println("size of T_shirt m");
        
        break;
      default: System.out.println("value not found");
		
        }
		
	}
	

}
