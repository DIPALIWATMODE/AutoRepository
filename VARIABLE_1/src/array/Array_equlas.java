package array;

import java.util.Arrays;

public class Array_equlas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] obj= {11,22,33,44,55};
			int[] obj1= {11,22,33,44,55};
			int[] obj2= {10,20,30,40,50};
			boolean B1=Arrays.equals(obj, obj1);
			System.out.println(B1);
			boolean B2=Arrays.equals(obj1, obj2);
			System.out.println(B2);
			boolean B3=Arrays.equals(obj, obj2);
			System.out.println(B3);
	}

}
