package array;

public class Multi_without1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] ab= {{2,5,6},{4,9,12}};
		System.out.println(ab[0][1]);
	//	for nested loop
		for(int x=0;x<2;x++) {
			for(int j=0;j<3;j++) {
				System.out.print("ab[" + x + "][" + j + "]="+ab[x][j] +  " " );
			}
//	System.out.print("ed[" + i + "][" + j +"]="+ed [i] [j]+" ");
				System.out.println();
		}
		
	}

}
