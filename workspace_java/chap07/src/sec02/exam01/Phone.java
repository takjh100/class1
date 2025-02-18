package sec02.exam01;

public class Phone{

	String number;
	Phone(String number){
		this.number = number;
	}
	

	//전화걸기
	void call(String number) {
		
		System.out.println(number +"로 전화를 겁니다");
	}
	
	//전화받기
	void answer() {
		System.out.println("전화가 왔습니다");
	}
	
}
