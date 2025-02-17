package sec02.exam01;

public class Cat extends Animal{

	int age;
	
	@Override
	void sound() {
		System.out.println("¹Ì ¾ß ¿Ë~~");
	}
	
	@Override
	void eat() {
		System.out.println("Ãò·ç·ì Ãò·ç·ì");
	}
	
	void push() {
		System.out.println("²Ú²ÚÀÌ ÇÕ´Ï´Ù");
	}
}
