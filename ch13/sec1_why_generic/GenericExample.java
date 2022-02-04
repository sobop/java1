package ch13.sec1_why_generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		// List : Collections, interface
		// 배열과 같은 특성, 인덱스(순서를 유지), 중복 저장이 가능
		// List에 저장되는 것은 어떤 객체든지 저장이 가능
		List list = new ArrayList();
		list.add("hello");
		String str = (String)list.get(0);	// get() 반환형은 Object -> 타입변환
		
		list.add(new Integer(1));	// 객체를 저장하므로 Integer 객체를 저장 가능
		int num = (Integer)list.get(1);	// get() 메소드의 반환형은 Object이므로 Integer로 형변환
		// List를 사용할 때 여러가지 타입을 저장하지않고 같은 타입을 저장하는 것이 보통이다.
		// 혼용하지 않고 한가지 타입을 보통 저장한다.
		
		// Generic을 사용하는경우
		// 구체적인 타입을 지정한다 -> String 타입을 저장하겠다고 지정
		List<String> strList = new ArrayList<String>();
		strList.add("hello");
		String out = strList.get(0);	// 타입변환 하지 않아도 된다.
		int out2 = strList.get(0);		// 에러표시가 뜬다 : String을 int에 저장
		// Generic을 사용해서 구체적인 타입을 지정해주면, 그 타입을 사용해야지만 된다.
		// 타입의 오류를 막을 수 있다. 다른 타입을 사용하는 오류를 막을 수 있다.
		// Generic을 사용하는 이유 : 일반적으로 객체 형태를 저장하는 방법을 제공한다.
		// 어떤 데이터 타입도 저장할 수 있다.
		// 제네릭 표현을 사용하도록 허용 : List<E> -> 객체를 제네릭을 사용해서 E라는 문자를 사용해서 표현할 수 있도록 해준다.
	}

}
