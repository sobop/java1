package ch10;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Animal animal = new Cat();	// Cat 객체를 생성
		Dog dog = (Dog)animal;	// ClassCastException
	}

}

class Animal { }

class Cat extends Animal { }

class Dog extends Animal { }