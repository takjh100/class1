package sec03.exam01;

public class Car {
	
	// 생성자
	// new 할때 
	
	String brand ="아반떼";
	String color;
	int cc;
	
	//클래스를 new 생성할때
	//1.필드 먼저 선언됨
	//2.생성자 실행
//	public Car() {
	Car(int c) {
	  cc= c; 
	  color = "흰색";
	  System.out.println("Car() 생성");
	  test();
	}
	
	Car (String b){
		brand = b;
		System.out.println("Car (String) 생성 :"+brand);
	}

	Car (){
		this ("아반떼", "흰색", 1300);
		System.out.println("Car() 생성자 실행");
	}
	
	Car (String b, String c, int cc2){
		//Car() 호출
		//다른 생성자 호출하는 방법
		//무조건 첫번째 줄에서 호출해야 한다.
//		this ();
		brand = b;
		color = c;
		cc = cc2;
		System.out.println("Car (String b, String c, int cc2) 생성자 실행");
	    
		
	
	}
	
	Car(String brand,int cc){
		
		String color = "파랑";
		System.out.println(color);
		System.out.println(this.color);
	
		this.brand = brand;
		this.cc = cc;
	}
	
	void setBrand(String brand) {
		this.brand = brand;
	}
	
	void test() {
		System.out.println("test() 실행");
	}
	
	
}
