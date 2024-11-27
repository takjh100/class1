package sec02.exam04;

public class OpExam {

	public static void main(String[] args) {
       
		boolean a = false;
		System.out.println("a : "+a);
		
		a = !a;
		System.out.println("a : "+a);
		
		double b = 7.0;
		System.out.println(b / 3);
//		System.out.println(b / 0); 
//		double을 0으로 나누면 Infinity 에러
//		System.out.println(3 / 0);
//		int를 0으로 나누면 "/by zero 에러
		
		int c = 1221341;
		int d = 5;
		System.out.println("몫 : "+(c/d));
		System.out.println("나머지 : "+(c % d));
		
//		깜짝문제
//		만원이 있고 4500짜리 커피를 몇잔 마실 수 있는가?
//		그때의 잔돈은?
		int q = 10000;
		int w = 4500;		
		System.out.println("몇잔 : "+(q / w));
		System.out.println("잔돈 : "+(q % w));
		
		
//		조금 어려운 문제
//		올리브영에서 전품목 15% 세일중
//		1. 꿀홍차 (5000)원을 샀을때 얼마를 내야하나?
//		2. 꿀홍차 (5000)와 립스틱(30000)을 사면?
//		Q1.
		int h = 5000;
		int r = 30000;
		double s = 0.15;
		double h2 = h-(h*s);
		double r2 = r-(r*s);
		double t = h2 + r2;
		System.out.println("h2 : "+ h2);
		System.out.println("t : "+ t);
		
		
		
//		풀어야되는 문제
//		7234원이 있어요
//		5000,1000,500,100,50,10,1원
//		각각 최대 몇개까지로 표현할 수 있나요?
		int m = 7234;
    	int cnt5000 = m / 5000; //1
    	int m2 = m % 5000;//2234
    	System.out.println("5000 : "+cnt5000);
    	int cnt1000 = m2 / 1000 ;
    	System.out.println("1000 : "+cnt1000);  
    	m2 = m2 %1000;
    	int cnt500 = m2 / 500;
    	System.out.println("500 : "+cnt500);
    	m2 = m2 % 500;
		int cnt100 = m2 / 100;
		System.out.println("100 : "+cnt100);
		m2 = m2 % 100;
		int cnt50 = m2 / 50;
		System.out.println("50 : "+cnt50);
		m2 = m2 % 50;
		int cnt10 = m2/ 10;
		System.out.println("10 : "+cnt10);
		m2 = m2 % 10;
		int cnt1 = m2/ 1;
		System.out.println("1 : "+cnt1);
		
	
		System.out.println("" + 3 + 3.0 );
//		숫자를 문자로 바꾸는법 ""
		
		String c2 = "100";
		int c3 = Integer.parseInt(c2);
		System.out.println(c3 + 3);
//        문자를 숫자로 변경 Integer.parseInt()
		
		boolean bool = 3 > 5;
		System.out.println(bool);
        
		System.out.println(1 == 1);
		System.out.println(1 == 1.0);
		System.out.println(1.0f == 1.0);
		
		System.out.println(0.1f == 0.1);
//		소수점 이하는 정확하지 않아서
//		0.1을 0.099999999 또는 0.100000001로 처리
//		같은 타입으로 변환해서 비교하자
		System.out.println(0.1f == (float)0.1);
		
		System.out.println('C'< 'J');
//		System.out.println("ab > "ac);
		
		System.out.println("3 != 3 :"+ (3 != 3));
		
		String s1 = "탁정현";
		String s2 = "탁정현";
	    System.out.println(s1 ==s2);
//		글씨 비교는 == 사용금지
	    System.out.println(s1.equals(s2));
	    System.out.println("탁정현".equals(s2));
	    System.out.println(!s1.equals(s2));
//	    글씨비교는 String 변수 또는 "글씨".equals(비교값)
	    
	    int i1 = 87;
	    System.out.println(i1 + "은 B 학점인가?");
	    System.out.println(
	    		(i1 >= 80 && i1 < 90)
	    		);
	    System.out.println(
	    		(i1 >= 80 || i1 < 90)
	    		);
	    System.out.println(10 | 1 );
	    
	    int k1 = 7;
	    int k2 = 15;
	    int k3 = 17;
	    System.out.println("k3이 가장 큰 값인가?");
//	    k3가 k1보다도 크거나 같고 
//	    k2보다도 크거나 같으면 k3가 가장 크다
	    System.out.println(k3 >= k1 & k3 >= k2);
	    
	    int m1 = 5;
	    m1 = m1 + 2;
	    m1 += 2;  //m1 = m1 + 2; 과 같은 뜻을 가진다
	    
	    int n1 = 10;
	    n1 = n1 + 1;
	    n1 += 1;
	    n1++;
	    ++n1;
	    
	    n1 = n1 - 1;
	    n1 -= 1;
	    n1--;
	    --n1;
	    int n2 = 10;
	    System.out.println("n2 : "+ (++n2));
	    System.out.println("n2 : "+ (n2++));
	    System.out.println("n2 : "+ n2);
	    
	    int scoer = 95;
	    cher grade = (score > 90) ? 'A' : 'B';
	    		
		
		
	}

}
