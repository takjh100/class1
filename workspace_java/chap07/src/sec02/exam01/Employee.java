package sec02.exam01;

public class Employee {

	int money;
	
	void salary(int money) {
		System.out.printf("����"+money+"�� �޾ҽ��ϴ�");
//		System.out.printf("���� %d�� �޾ҽ��ϴ�",money);
		//printf : %d �� money�� ��
		this.money += money; 
	}
	
	void study(String theme) {
		System.out.println(theme + "���θ� �մϴ�");
	}
	
	void service() {
		System.out.println("�մ��� �����մϴ�");
	}
}
