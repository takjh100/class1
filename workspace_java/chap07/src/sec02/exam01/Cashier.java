package sec02.exam01;

public class Cashier extends Employee {

	String mane = "Cashier";
	
	void adjustment() {
		System.out.println(mane +"가 정산을 합니다");
	}
	
	void clean() {
		System.out.println(mane + "가 매장을 청소합니다");
	}
	
	
}
