package interface_1;

public interface InterA {

	public void V3();
	
	public void V4();
	
	public void V5();
	
	static void V6() {
		System.out.println("hi dipali");
	}

	public static void main(String[] args) {
		
		V6();
		InterA.V6();
	}
	
}
