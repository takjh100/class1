package sec02.exam01;

public class Barista extends Employee {

	public Barista() {
		
	}
	
	String coffee (String menu) {
		System.out.println("��"+ menu + "�� �����մϴ�");
		return menu;
	}
	
	void dish() {
		System.out.println("�� �������� �մϴ�");
	}
	
	void bookkeeping() {
		System.out.println("�� ��θ� �ۼ��մϴ�");
	}
	
	void printMoney() {
		System.out.println("�ٸ���Ÿ �ܾ� :"+this.money);
	}
}
