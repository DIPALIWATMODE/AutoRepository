package array;

public class Multi_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] table=new int[2][3];
		
		table[0][0]=10;
		table[0][1]=77;
		table[0][2]=70;
		table[1][0]=32;
		table[1][1]=40;
		table[1][2]=30;
		System.out.println(table[1][0]);
		for (int i=0;i<2;i++) {
			for(int n=0;n<3;n++) {
				System.out.print(table[i][n]+" ");
		}
			System.out.println(" ");
	}

}}