package sec03.exam02;

public abstract class Animal {

	Animal() {}
	
	Animal(String name) {
	}
	
	String kind;
	
	void breathe() {
		System.out.println("숨숴 숨숴");
	}
	
	abstract void sound();
	//추상 메소드 실행블럭 {}이 있으면 안됨
	//나는 구현하지않음 
	//대신에 나를 상속받은 자식이 반드시 구현해야한다.
}
