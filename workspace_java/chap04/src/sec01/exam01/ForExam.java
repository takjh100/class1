package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {

		int sum = 0;

		// 1씩 증가하는 것을 5번 하고싶다.
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		System.out.println("sum : " + sum);

		// 1 + 2 + 3 + 4 + 5
		// 참고로 1~n까지의 합
		// n*(n+1)/2
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println("sum : " + sum);

		int i = 1;

		sum = 0;

		sum = sum + i; // 1

		i++;
		sum = sum + i; // 2

		i++; // 3
		sum = sum + i; // 3

		i++; // 4
		sum = sum + i; // 4

		
		i++; // 5
		sum = sum + i; // 5
        System.out.println("sum : "+sum);
        
		/*
		 * 반복문을 만드는 원리
		 * 
		 * 1. 반복되는 것 찾기 Ctrl + c,v 했을때 바뀌지않는 것
		 * 
		 * 2. 반복 되지 않는 것 찾기 규칙(패턴)을 찾을 수 있으면 반복문으로 만들 수 있다 변수를 활용해서 더이상 바뀌지 않게 만들기
		 * 
		 * 3. 시작 조건(값)
		 *
		 * 4. 종료 조건
		 *
		 * for :반복 횟수를 아는 경우
		 * 
		 * while :반복 횟수를 모르는 경우
		 * 
		 */
		
	     int sum2 = 0;
	     for (int e = 1; e <= 100; e++) {
//	    	 System.out.println("e : "+e);
	    	 sum2 = sum2 + e;
//	    	 System.out.println("sum2 : "+sum);
	     }
	     
	     System.out.println("sum2 : "+sum2);

	     
	     int sum3 = 0;
	     for (int e = 1; e <= 100; e++) {
//	    	 System.out.println("e : "+e);
	    	 sum3 = sum3 + e;
//	    	 System.out.println("sum3 : "+sum);
	     }
	     
	     System.out.println("sum3 : "+sum3);	     
	     
	     
	     for (int b = 1; b <= 10; b++) {
	    	 System.out.println( b );
	     }
	     
	     int x = 0;
	     for (int z =1; z <=100;z++) {
	    	 x = z + x;
	    	    
	     }
	     System.out.println("1~100의 합"+ x);
	    	 
	     //문제
//	     10부터 1을 출력하시오
	     
	     for (int o =10; o > 0; o--) {
	    	 System.out.println( o+"a" );
	     }	 
	     
	     
	     // 1 ~ 20 까지 짝수만 출력하시오
	     // i % 2 를 사용하여 1 ~20 까지 짝수 출력
	     
	      
	     int i2 =0;     
	     for (int i1 = 1; i1 <= 20; i1++) {
	     
	      if (i1 % 2 == 0) {
	    	 System.out.println(i1);
	     }
	    	
	     }
	     
	     
	     
	     // 1 ~ 20 까지 3 의 배수만 출력하시오
	    
	     for (int i3 = 1; i3 <= 20; i3++) {
	    	if (i3 % 3 == 0) {
	    		System.out.println(i3);
	    	}
	    		
	     }
	    	 
	     
	     //1~5 까지 모두 츨력하면서 홀/짝 출력
	     for (int i5 = 1; i5 <= 5; i5++) {
	    	if (i5 % 2 ==0) {
	    		System.out.println("짝 :"+i5);
	    	}else {
	    		System.out.println("홀 :"+i5);
	    	} 
	     }
	    
	     //1~20 까지 홀수의 합
	     int i7 = 0;
	     for (int i6 = 1; i6 <=20; i6++) {
	    	 if(i6 % 2 == 0) {
	    		
	    	 }else{
		    		i7 = i7+i6;
		    	 }
		    		 	 
	     }System.out.println(i7);
	     
	     
	     //1~20 까지 홀수의 개수
	     int i8 = 0;
	     for (int i9 = 1; i9 <=20; i9++) {
	    	 if(i9 % 2 == 0) {
	    		
	    	 }else{
		    		i8 = i8 + 1;
		    	 }
		    		 	 
	     }System.out.println(i8);
	     
	     
	     
	     //1~10 까지 옆으로 3개씩 출력
	     
	     int q2 = 0;
	     for (int q1 = 1 ; q1 <=10; q1++ ) {
	    	 
	    	 q2 = q1;
	    	 System.out.print(q1);
	    	 System.out.println();
	     }
	     System.out.print(q1);
	    	 
	     // 구구단 2 단 출력
	     // 2 x 1 = 2
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	  
	     
	     
	}

}