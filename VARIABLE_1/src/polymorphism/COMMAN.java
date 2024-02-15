package polymorphism;

class v {
	
	public void method1() {
		System.out.println("run method");
	}
	
	
}
public class COMMAN extends v{

	
	public void method1() {
		System.out.println("run method  1");
	}

	public static void main(String[] args) {
		COMMAN obj =new COMMAN();
		obj.method1();
		
	}
}
