package quiz;

public class Phone {

	boolean power;

	void call(String number) {
		System.out.println(number + "�� ��ȭ �Ŵ���...");
	}

	void onOff() {
//		if(this.power) {
//			this.power = false;
//		}else {
//			this.power = true;
//		}

		this.power = !this.power;
	}

	void bell() {
		System.out.println("������");
	}
}
