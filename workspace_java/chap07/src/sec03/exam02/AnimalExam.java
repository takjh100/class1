package sec03.exam02;

public class AnimalExam {

	public static void main(String[] args) {

		//�߻�Ŭ������ new �� �� ����
//		new Animal();
		Cat cat = new Cat();
		Animal a = cat;
		a.sound();
		cat = (Cat)a;
	
		Cat cat3 = new Cat();
		cat3.name = "����� 1ȣ";
		setName(cat3);
		System.out.println(cat3.name);
	}
	
	//���� ����
	//�������ڷ� ����Ÿ���� ���� ��� ������ ��������� ����
	//�������ڷδ� stack ������ ���� ����Ǿ� ���޵ȴ�
	static void setName(Cat cat) {
		cat.name = "����� 2ȣ";
	}
	
	//��������
	static Cat testName(Cat cat) {
		Cat cat2 = new Cat();
		cat2.name = cat.name;
		
		cat2.name = "����� 2ȣ";
		return cat2;
	}

}
