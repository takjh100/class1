package sec01.exam02;

public class StringExam {

	public static void main(String[] args) {

		String s1 = "영일이삼사오육칠팔구삼사";
		
//		char a = 'a';
		char c = s1.charAt(0);
		System.out.println("char c :"+c);
		
		//왼쪽부터 첫번째 일치하는 인덱스를 돌려줌 
		//없으면 -1
		int i = s1.indexOf("삼사");
		System.out.println("indexOf : "+i);
		int i2 = s1.indexOf("a");
		System.out.println("indexOf 없는것: "+i2);
		
		//오른쪽부터 첫번째 일치하는 인덱스를 돌려줌
		int i3 = s1.lastIndexOf("삼사");
		System.out.println("lastindexOf : "+i3);
		
		//이메일 양식 점검
		//@와 .이 하나 이상 있어야 정확한 이메일 주소 양식이라고 판단
		String email = "todair@Human.or.kr"; 
		
		int a = email.indexOf("@");
		int b = email.indexOf(".");
		
		if(a != -1 && b >= 0) {
			System.out.println("이메일 형식이 맞습니다");
		}else {
			System.out.println("이메일 형식이 아닙니다");
		}
		
		//인덱스오브 구현 예제
//		for(int j=0; j< s1.length(); j++) {
//			char c1 = s1.charAt(j);
//			if(c1 == '@') {
//				//인덱스 출력 또는 리턴하는 메소드
//				return;
//			}
//		}
		
		
		//첫번째 전달인자를 두번째 전달인자로 모두 바꿔줌
		String s2 = s1.replace("삼사", "34");
		System.out.println("s1 :"+ s1);
		System.out.println("s2 :"+ s2);
		// replace는 모든걸 바꿔준다
		// 비파괴함수
		
		//시작 index부터 종료index 바로 앞까지 잘라서 돌려줌
		String s3 = s1.substring(2,4);
		System.out.println("substring(2,4) :" +s3);
		
		//성별 남,여 로 출력하기
		String ssn = "123456-1234567";
		
		String ssn1 = ssn.substring(7,8);
        
		if(ssn1.equals("1") || ssn1.equals("3")) {
			System.out.println("남성");
		}else {
			System.out.println("여성");
		}
		
		// trim : 앞뒤 공백만 제거, 중간 공백은 제거하지 않음
		String s5 = " 글씨   중간띄우기    ";
		System.out.println("["+s5+"]");
		System.out.println("["+s5.trim()+"]");
		
		// split: 구분자로 글씨를 잘라서 배열로 돌려준다
		//        구분자는 사라짐
		// split의 전달인자는 String이 아니라 정규표현식
		// 정규표현식의 예약글자는 그냥 쓰면 안된다
		// 역슬래시로 탈출시키거나 []감싸준다
		String menu = "아무거나,풀떼기,햄버거";
		String[] menus =  menu.split(",");
		for(String m : menus) {
			System.out.println(m);
		}
		
		String url = "cafe.naver.com";
//		String[] urls =  menu.split(".");
		//[]로 감싸거나
		String[] urls =  menu.split("[.]");
		//역슬레시 두개
//		String[] urls2 =  menu.split("//.");
		System.out.println(urls.length);
		
//		문제1
//		다음은 query string이 포함된 네이버의 검색 주소입니다
//		검색어의 key 값은 query입니다.
//		검색어만 출력하세요
		String search = "https://search.naver.com/search.naver?where=nexearch&sm=top_sug.pre&fbm=0&acr=1&acq=grok&qdt=0&ie=utf8&query=grok3";

		int sc1 = search.indexOf("query");		
		
		// 문제2
		// html 속성 class에 cl의 text가 있을때
		// target의 class가 존재하는지 한단
		String cl = "red bigy px";
		String target = "big";
	
		//아래 코드처럼 하면 메모리가 낭비된다
		String a1 = "a";
		a1 += "b";
		
		//메모리를 효율적으로 사용한다
		//스레드에 안전하다
		StringBuffer sb = new StringBuffer("abc");
		sb.append("defg");
		String d = sb.toString();
		
	
	}
	
	

}
