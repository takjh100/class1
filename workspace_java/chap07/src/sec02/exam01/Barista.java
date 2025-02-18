package sec02.exam01;

public class Barista extends Employee {

	public Barista() {
		
	}
	
	String coffee (String menu) {
		System.out.println("가"+ menu + "를 추출합니다");
		return menu;
	}
	
	void dish() {
		System.out.println("가 설거지를 합니다");
	}
	
	void bookkeeping() {
		System.out.println("가 장부를 작성합니다");
	}
	
	void printMoney() {
		System.out.println("바리스타 잔액 :"+this.money);
	}
}
