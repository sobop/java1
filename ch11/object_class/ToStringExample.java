package ch11.object_class;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj);	// 내부적으로 obj.toString()을 호출한다.
		// default : 객체 이름과 생성된 객체의 주소를 출력
		// 어떤 의미가 있는가? 주소는 의미가 없음.
		// toString을 재정의를 해서 객체의 정보를 출력한다.
		Date date = new Date();
		System.out.println(date);	// 현재 시각 정보가 출력
		System.out.println(date.toString());	// 현재 시각 정보가 출력
		// Date 객체는 내부적으로 toString() 메서드를 재정의해서 현재의 시각을 출력
	}

}
