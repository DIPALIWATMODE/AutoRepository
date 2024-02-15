package parametrization;

public class Super_01 extends Super_02{
	double d=60.56;
	public void disply() {
		
		//dusry class mhadhun ghycha asel tr to method thorought gheu shakta
		//System.out.println(super.d);
	}
	public void M() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_01 s= new Super_01();
		System.out.println(s.d);//tych class madhun ase accexs rayche
		s.disply();
		//variable (d)name change asel tr method mhadhr krachi garaj nhi rahat drectly hote
		//man method la syso mhethod madhe
		System.out.println(s.t);
		
	}

}