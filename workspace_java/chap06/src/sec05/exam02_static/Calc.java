package sec05.exam02_static;

public class Calc {

	String color;
	static double pi = 3.14;
	
	Calc(){
		pi = 3.141592;
	}
	
	static Print out = new Print();
	
	static void printPi() {
		//아직 인스턴스화 되지않을때도 static을 쓸 수 있어서 this를 사용할 수 없음
		//static은 static 끼리 사용가능
//		System.out.println("pi"+this.pi);
		System.out.println("pi"+ pi);
	}
	
	//new 가 되지않아 color를 사용할 수 없음
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
