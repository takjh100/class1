package sec02.exam01;

public class Smart extends CellPhone{
	
	Smart(String number){
		super(number);
	}

	void search(String data) {
		System.out.println(data + "을 검색합니다");
	}
}
