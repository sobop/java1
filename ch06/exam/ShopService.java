package ch06.exam;

public class ShopService {
	private static ShopService instance = null;
	
	private ShopService() { }
	
	public static ShopService getInstance() {
		if (instance == null) {
			instance = new ShopService();
		}
		return instance;
	}
}
