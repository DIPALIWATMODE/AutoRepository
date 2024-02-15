package interface_1;

public class Imple_C_comman implements Inter_C {
public static void main(String[] args) {
	Imple_C_comman obj= new Imple_C_comman();
	obj.blue();
	obj.pick(80);
	obj.red();
	Inter_C tt=new Imple_C_comman();
	tt.blue();
	tt.pick(60);
	tt.red();
	
}

@Override
public void pick(int x) {
	// TODO Auto-generated method stub
	System.out.println("hii pick");
}

@Override
public void red() {
	// TODO Auto-generated method stub
	System.out.println("hii red");
}

@Override
public void blue() {
	// TODO Auto-generated method stub
	System.out.println("hii blue");
}

}
