package exception;



public class M_check_uncheck_ex {
	//exception_when something may happened which cause disturbance of our normal flow of our script
//   exception handling _it is process of handling exception to insure normal flow of script without any error
	public void get() {
	
	int [] a=new int[2];
	a[0]=1;
	a[1]=2;
	a[2]=4;//error nhi d
	System.out.println(a[1]);
	}
	public void print() throws InterruptedException {//check errar dete
		Thread.sleep(2000);
	}
//	public void gigo()  throws FileInputStream{}
//		FileInputStream fis =new FileInputStream(" ");//patially che maza kde error yet ahe sir kde nhi krn file nhi maza jvl
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 M_check_uncheck_ex obj=new  M_check_uncheck_ex();
		 obj.get();
	}

}
