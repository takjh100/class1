package sec05.exam02_static;

public class CalcExam {

	public static void main(String[] args) {

		// static������ pi�� new �����ʾƵ� �����ִ�
		//�տ� ����ִ��� Calc�� �����
		System.out.println(Calc.pi);
		
		Calc c = new Calc();
		c.color = "���ǵ�";
				
		System.out.println(c.pi);
		
		
		Calc c2 = new Calc();
		c2.color = "�Ķ�";
		
		System.out.println(c2.pi);
		
		Calc.pi= 2;
		System.out.println(c.pi);
		System.out.println(c2.pi);
		
		c2 = c;
		
		Calc.printPi();
		
		Calc.out.println("�۾�");
	
//		tset();
		CalcExam ce = new CalcExam();
		ce.test();
	}
	
//	static void test() {
    void test() {
    	
    }
}
