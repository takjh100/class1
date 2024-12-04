package sec01.exam01;

public class RefExam {

	public static void main(String[] args) {

	   	//5 장 참조타입
		
		int a = 10;
		int b = a;
		System.out.println(a+" , "+b);
		b = 12;
		System.out.println(a+" , "+b);
		
		String c = "탁정현";
		// = 을 기준으로 오른쪽이 먼저 실행된다.
		//"탁정현"이 힙heap 영역의 비어있는 번지에 할당
		//스택 stack 영역의 변수 c에 그 번지가 기록된다.
		System.out.println("c : "+ c);
		
		System.out.println(a == b);
		// == 은 무조건 스택의 값을 비교한다
		
		// 무조건 힙영역의 새로운 번지에 할당하는 방법
		String d = new String("탁정현");
		System.out.println(d);
		System.out.println(c == d);
		// == 무조건 스택의 값을 비교한다.
	    
		System.out.println(c.equals(d));
		//String 값의 비교는 equals()를 사용한다.
		
		String e = "탁정현";
		System.out.println(c == e);
		
//		a = null;
		// 기본 타입은 null을 넣을 수 없다.
		
		String f = "휴먼";
		System.out.println("f == null :"+ (f == null));
		System.out.println("f != null :"+ (f != null));
		
		f = null;    //f = ""과 다르다
		System.out.println("f == null :"+ (f == null));
		System.out.println("f != null :"+ (f != null));
		
		System.out.println("f + \"abc\" : " + (f + "abc"));
		
//		String g;
		String g = null;
		System.out.println("g == null" + (g == null));
//		초기화나 값이 할당되지 않은 경우 사용하지 못한다
		
		if (g != null) {  //방어코딩
		System.out.println("g.equals :"+ g.equals((c)));
		}
		
		
		
		
		
	}

}
