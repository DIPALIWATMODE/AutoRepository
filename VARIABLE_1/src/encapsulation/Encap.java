package encapsulation;

public class Encap {
			private int E=12000;
	public void hidemoney(int v) {
			E=v;
			System.out.println(E);
	}
			
	public static void main(String[] args) {
		Encap  rE =new Encap ();
				rE.hidemoney(200);
		
			

	}

}
