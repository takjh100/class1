package sec05.exam01;

public class Car {

	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	//�޼ҵ�� : printModel
	//�������� : ����
	//����Ÿ�� : ����
	//�ʵ��� model�� ���
	void printModel() {
		int a = 9; // �ۿ��� ������ �� ����
		System.out.println(this.model);
		
	}
}
