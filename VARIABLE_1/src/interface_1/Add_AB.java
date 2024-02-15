package interface_1;

public class Add_AB extends AB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add_AB obj =new Add_AB();
		obj.ankki();
		obj.chinkki();
		System.out.println(obj.G);
		obj.nikki();
		
	}

	@Override
	public void nikki() {
		// TODO Auto-generated method stub
		System.out.println("run nikki");
	}

	@Override
	public void ankki() {
		// TODO Auto-generated method stub
		System.out.println(" run ankki");
	}

}
