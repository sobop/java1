package ch06.import_example;

import java.util.Calendar;
import java.util.Scanner;

import ch06.method_return.Car;

public class ImportExample {

	public static void main(String[] args) {
		// 내 클래스에서 정의되지 않은 외부 클래스를 사용하려면 import를 해주어야한다.
		// Calendar 클래스가 어디있는지 알려줘야한다.
		// JVM이 Calendar 클래스를 로딩을 해야하므로 어디에 있는지 알아야 로딩을 할 수 있음.
		Calendar now = Calendar.getInstance();	// SingleTon
		// 사용하려면 어느 패키지에 있는 클래스인지 알려주어야한다. -> import 사용해서 알려주기
		ch06.method_return.Car car1 = new ch06.method_return.Car();
		Car car2 = new Car();
		// CTRL+SHIFT+o -> 자동으로 import 해준다
		Scanner scanner = new Scanner(System.in);
	}

}
