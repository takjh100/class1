package sec02.exam01;

public class Phone{

	String number;
	Phone(String number){
		this.number = number;
	}
	

	//��ȭ�ɱ�
	void call(String number) {
		
		System.out.println(number +"�� ��ȭ�� �̴ϴ�");
	}
	
	//��ȭ�ޱ�
	void answer() {
		System.out.println("��ȭ�� �Խ��ϴ�");
	}
	
}
