package sec05.exam05._final;

public class Person {

	final String mation = "korea";
	final String ssn;
	
	//���(static final)-�׻� ���� ��
	static final double PI = 3.14;
	
	Person(){
		this.ssn = "123";
	}
	
	void test() {
//		this.ssn = "123"; final�� ���� ���� �Ұ�
	}
}
