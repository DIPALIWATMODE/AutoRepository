package loop;

public class FloysTriangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int num=1;
		for(int x=1;x<=row;x++) {
			for(int j=1;j<=x;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
