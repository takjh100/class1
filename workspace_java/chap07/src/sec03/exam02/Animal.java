package sec03.exam02;

public abstract class Animal {

	Animal() {}
	
	Animal(String name) {
	}
	
	String kind;
	
	void breathe() {
		System.out.println("���� ����");
	}
	
	abstract void sound();
	//�߻� �޼ҵ� ����� {}�� ������ �ȵ�
	//���� ������������ 
	//��ſ� ���� ��ӹ��� �ڽ��� �ݵ�� �����ؾ��Ѵ�.
}
