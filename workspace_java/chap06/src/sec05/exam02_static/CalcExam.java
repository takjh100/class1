package sec05.exam02_static;

public class CalcExam {

	public static void main(String[] args) {

		// static변수인 pi는 new 하지않아도 쓸수있다
		//앞에 어디있는지 Calc는 써야함
		System.out.println(Calc.pi);
		
		Calc c = new Calc();
		c.color = "버건디";
				
		System.out.println(c.pi);
		
		
		Calc c2 = new Calc();
		c2.color = "파랑";
		
		System.out.println(c2.pi);
		
		Calc.pi= 2;
		System.out.println(c.pi);
		System.out.println(c2.pi);
		
		c2 = c;
		
		Calc.printPi();
		
		Calc.out.println("글씨");
	
//		tset();
		CalcExam ce = new CalcExam();
		ce.test();
	}
	
//	static void test() {
    void test() {
    	
    }
}
