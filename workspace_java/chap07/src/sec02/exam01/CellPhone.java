package sec02.exam01;

public class CellPhone extends Phone{
	
	CellPhone(String number){
		super(number);
	}

//	@Override
	void answer(String call) {
		System.out.println(call + "���� ��ȭ�� �Խ��ϴ�");
	}
	
	void message(String number,String text) {
		System.out.println(number +"��"+text+ "���ڸ� �����ϴ�");
	}
}
