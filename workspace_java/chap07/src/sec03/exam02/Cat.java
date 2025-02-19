package sec03.exam02;

public class Cat extends Animal{

	String name;
	
	Cat(){
		super("null");
	}
	
	@Override
	void sound() {
		System.out.println("³É³É");
	}

}
