package sec02.exam01;

public class AnimalExam2 {

	public static void main(String[] args) {

		Cat cat = new Cat();
		Animal a1 = (Animal)cat;
		feed(a1);
		
		//�ٿ��� ����
		feed(new Cat());
		
		Animal a2 = new Dog();
		feed(a2);
		
		
		
	}

	static void feed(Animal animal) {
		System.out.println("--------feed ����");
		animal.eat();
		animal.sound();
	}
}
