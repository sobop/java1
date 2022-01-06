package ch05;

public class GarbageCollectionExample {

	public static void main(String[] args) {
		String hobby = "게임";
		hobby = null;	//쓰레기 객체 취급
		System.out.println(hobby);
	}

}
