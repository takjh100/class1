package sec05.exam02_static;

public class Calc {

	String color;
	static double pi = 3.14;
	
	Calc(){
		pi = 3.141592;
	}
	
	static Print out = new Print();
	
	static void printPi() {
		//���� �ν��Ͻ�ȭ ������������ static�� �� �� �־ this�� ����� �� ����
		//static�� static ���� ��밡��
//		System.out.println("pi"+this.pi);
		System.out.println("pi"+ pi);
	}
	
	//new �� �����ʾ� color�� ����� �� ����
//	static void printColor() {
////		System.out.println("color"+this.color);
//		System.out.println("color"+ color);
//	}
	
	//
    void printPi2() {
//    	System.out.println("pi"+this.pi);
    	System.out.println("pi"+ pi);
    }
    
}
