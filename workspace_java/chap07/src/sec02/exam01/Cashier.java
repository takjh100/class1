package sec02.exam01;

public class Cashier extends Employee {

	public Cashier() {
		
	}
	
	void adjustment() {
		System.out.println("가 정산을 합니다");
	}
	
	void clean() {
		System.out.println("가 매장을 청소합니다");
	}
	
	void printMoney() {
		System.out.println("점원 잔액 :"+this.money);
	}
}
