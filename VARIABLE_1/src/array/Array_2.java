package array;

public class Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]age=new int[4];
		age[0]=20;
		age[1]=50;
		age[2]=30;
		age[3]=35;
		System.out.println(age[2]);
		
		
		//to determine length of array
		System.out.println(age.length);
		
		
		for(int d=0;d<age.length;d++) {
			System.out.println(age[d]);
			
			
			//		for each loop	
			System.out.println(".................");
			for(int s:age) {
				System.out.println(s);
			}
		}
	}

}
