package sec02.exam01;

public class Cashier extends Employee {

	public Cashier() {
		
	}
	
	void adjustment() {
		System.out.println("�� ������ �մϴ�");
	}
	
	void clean() {
		System.out.println("�� ������ û���մϴ�");
	}
	
	void printMoney() {
		System.out.println("���� �ܾ� :"+this.money);
	}
}
