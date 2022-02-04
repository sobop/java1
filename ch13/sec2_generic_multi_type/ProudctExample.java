package ch13.sec2_generic_multi_type;

public class ProudctExample {

	public static void main(String[] args) {
		// 사용시에는 구체화 : kind로 Tv, model은 String사용
		Product<Tv, String> product = new Product<Tv, String>();
		product.setKind(new Tv());
		product.setModel("스마트TV");
		Tv tv = product.getKind();
		String model = product.getModel();
		
		// 타입을 구체화하여 사용한다
		Product<Car, String> product2 = new Product<>();
		// <>다이아몬드 표기법 사용가능
		// 앞에서 구체적인 <Car, String>을 정의했기 때문에 뒤에서 반복하지 않아도 된다.
		product2.setKind(new Car());
		product2.setModel("제네시스");
		Car myCar = product2.getKind();
		String model2 = product2.getModel();
	}

}

class Tv {
	
}
class Car{
	
}