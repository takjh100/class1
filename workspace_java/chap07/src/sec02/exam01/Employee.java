package sec02.exam01;

public class Employee {

	int money;
	
	void salary(int money) {
		System.out.printf("월급"+money+"을 받았습니다");
//		System.out.printf("월급 %d을 받았습니다",money);
		//printf : %d 로 money가 들어감
		this.money += money; 
	}
	
	void study(String theme) {
		System.out.println(theme + "공부를 합니다");
	}
	
	void service() {
		System.out.println("손님을 응대합니다");
	}
}
