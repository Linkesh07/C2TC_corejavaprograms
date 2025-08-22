package ShoppingMall;

public class ShoppingMallDemo {

	public static void main(String[] args) {
		Shopping s = new Cloth();
		s.purchase();
		s = new Electronics();
		s.purchase();
	}

}
