package sec02.exam01;

public class Cat extends Animal{

	int age;
	
	@Override
	void sound() {
		System.out.println("�� �� ��~~");
	}
	
	@Override
	void eat() {
		System.out.println("���� ����");
	}
	
	void push() {
		System.out.println("�ڲ��� �մϴ�");
	}
}
