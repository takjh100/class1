package sec02.exam01;

public class CellPhone extends Phone{
	
	CellPhone(String number){
		super(number);
	}

//	@Override
	void answer(String call) {
		System.out.println(call + "에서 전화가 왔습니다");
	}
	
	void message(String number,String text) {
		System.out.println(number +"로"+text+ "문자를 보냅니다");
	}
}
