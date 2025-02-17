package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {

		//Animal�� eat�� sound�� �˰��ִ� ����
		Animal a1 = new Animal();
		a1.eat();
		a1.sound();
		
		Cat cat = new Cat();
		cat.eat();
		cat.push();
		
		Animal a2 = (Animal)cat;   //�ڽ��� �θ� �ɶ�
		Animal a3 = cat;           //�� ��ȯ ������ ���� ����
		                           //����� �ڽĿ��� �θ� ���´�

		a3.eat();
		a3.sound();
//		a3.push();
		
//		Dog dog = new Dog();
//		Animal a5 = (Animal)dog;
		Animal a4 = new Dog();
		a4.eat();
		a4.sound();
		
		catMom(cat);
		Dog dog = new Dog();
//		catMom(dog);
		Animal a6 = (Animal)cat;
		System.out.println("a6 == cat : " + (a6 == cat));
		feed(a6);
		feed(dog);
	}

	static void catMom(Cat cat) {
		cat.eat();
		cat.sound();
		cat.push();
	}
	
	static void feed(Animal animal) {
		System.out.println("           feed ����");
		animal.eat();
		animal.sound();
	}
}
