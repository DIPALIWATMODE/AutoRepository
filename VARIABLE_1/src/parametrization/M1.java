package parametrization;

public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu("paneer",150);
			menu("choket",50);
		menu("paneertika",90);
		M1 obj= new M1 ();
		obj.like("Audi","Bullet");
		obj.like("Mercedes","KtM");
	}
		public static void menu(String DishName,int Price) {
//			System.out.println("DishName= "+Price);
//			
//			System.out.println("Price= "+DishName);
			
			System.out.println("DishName= "+DishName);
			 
			System.out.println("Price="+Price);
		}
		public void like(String forWheeler,String toWheeler) {
			
			System.out.println("forWheeler= "+forWheeler);
			System.out.println("toWheeler= "+toWheeler);
		}
}
