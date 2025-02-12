package sec05.exam05._final;

public class Person {

	final String mation = "korea";
	final String ssn;
	
	//상수(static final)-항상 같은 수
	static final double PI = 3.14;
	
	Person(){
		this.ssn = "123";
	}
	
	void test() {
//		this.ssn = "123"; final은 값을 수정 불가
	}
}
