package sec02.exam01;

public class Barista extends Employee {

	
	void coffee (String coffee) {
		System.out.println(coffee + "를 추출합니다");
	}
	
	void dish() {
		System.out.println("가 설거지를 합니다");
	}
	
	void bookkeeping() {
		System.out.println("가 장부를 작성합니다");
	}
}
