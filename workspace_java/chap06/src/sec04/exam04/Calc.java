package sec04.exam04;

public class Calc {

	int plus(int x ,int y ) {
		System.out.println("int int 실행");
		int result =  x + y;
		return result;
//		return x+y; <<위 두줄을 간단하게 표현한 경우
	}
	
	//오버로딩 
	//1.전달인자를 신경쓰지 않고 비슷한 수행을 할 수 있게 해주는 기술
	//    1-1.전달인자의 개수,타입,순서등으로 구분할 수 있어야 한다.
	//2.전달인자의 우선순위
	//    2-1.전달인자가 정확히 동일한 타입
	//    2-2.없으면 자동 형 변환으로 실행될 수 있는 타입 찾기
	//3.전달인자가 너무 많고 보통 대부분이 기본값이 있는경우
	//  전달인자를 줄이는 목적으로도 사용함
	double plus(double x ,double y ) {
		System.out.println("double double 실행");
		double result =  x + y;
		return result;
	}
	double plus(int x ,double y ) {
		System.out.println("int double 실행");
		return x+y;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
	int plus (int x) {
		return x+x;
	}
	
	
	void execute() {
		double result = avg(7,10);
		p("평균:"+result);
	}
	
	void p(String msg) {
		System.out.println("-------결과-------");
		System.out.println(msg);
		System.out.println("------------------");
	}
	
//	void method1(String classDept, int classnum) {
//		System.out.println(classDept+","+classnum);
//	}
//	void method2() {
//		method1("천안",1);
//	}
	
	void method(String classDept, int classnum) {
		System.out.println(classDept+","+classnum);
	}
	void method() {
		method("천안",1);
	}
}
