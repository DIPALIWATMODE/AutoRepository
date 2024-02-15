package inheritance;

public class Multi_lCC extends Multi_lBB {
	public  void Y1(){
		System.out.println("Y1 not is run");

}

	public static void Y2(){
	System.out.println("Y2 is run");
	
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multi_lCC h=new Multi_lCC();
		h.D1();
		D2();//A

				h.G1();
				G2();//B
		h.Y1();
		Y2();//C
		
	}

}
