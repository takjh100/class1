package sec01.exam01;

public class ArrayExam {

	public static void main(String[] args) {

		//배열
		//선언방법 1
		int[] score; //java 스타일
		int score2[]; //c 스타일
		
		//변수 앞이 무조건 타입이라고 읽는 경우
		//score변수는 "int로 구성된 배열이다"
		
		//배열은 참조타입이라서 null상태로 만들 수 있다.
		score = null;
		
		int score_0 = 90;
		int score_1 = 60;
		int score_2 = 70;
		//배열 선언방법 1
		int[] intArray = new int[3];
		intArray[0] = 90;
		intArray[1] = 60;
//		intArray[2] = 70;
		
		System.out.println("intArray[0] : "+intArray[0]);
		//기본값은 0, false, null로 초기화 된다
		System.out.println("intArray[2] : "+intArray[2]);
		//java.lang.ArrayIndexOutOfBoundsException
		//0~2까지만 사용가능한데 3으로 시도했다
		//System.out.println("intArray[3] : "+intArray[3]);
		
		
		//배열 선언방법 2
		//넣을 값을 모두 정확히 알고 있는 경우
		int[] intAeeay2 = new int [] {90, (int)(Math.random()), 70};
		int[] intAeeay2_1 = null;
		intAeeay2_1 = new int [] {90, (int)(Math.random()), 70};
		
		//배열 선언방법 3
		//넣을 값을 모두 정확히 알고 있는 경우
		//new int [] 에 해당하는걸 생략가능
		//선언과 동시에 초기화 하는 경우에만 사용 가능
		int[] intAeeay3 = {90, (int)(Math.random()), 70};
		
		System.out.println("intAeeay3 의 길이" + intAeeay3.length);
		
	    System.out.println(intAeeay3);
		
		String[] sArr = new String[14];
		sArr[0] = "이름1";
		sArr[1] = "이름2";
		
		for (int k1 = 0; k1< sArr.length; k1++) {
			sArr[k1] = ("이름"+(k1+1));
		}
		
		//sArr의 모든 내용을 출력
		for (int k1 = 0; k1< sArr.length; k1++) {
			sArr[k1] = ("이름"+(k1+1));
			System.out.println(sArr[k1]);
		}
		
		//1~10까지 배열에 넣고
		//배열의 총 합 출력
		//배열의 평균값 출력
		int[] a = new int[10];
		int b = 0;
		for(int a1 =0; a1 < a.length; a1++) {
			a[a1] = (a1 + 1);
			System.out.println(a[a1]);
		}
			
			
		int c = 0;
		for(int a1 =0; a1 < a.length; a1++) {
			a[a1] = (a1 + 1);
			b +=a[a1];
			c +=  a[a1];
		}
		System.out.println(b);
		 System.out.println((double)c/a.length);	
		 
		 
		//1~10까지 배열을 거꾸로 출력
		 
		 
		int[] z = new int [10];
		
		for (int x= (z.length-1);x >= 0; x--) {
			z[x] = (x + 1);
			System.out.println(z[x]);
		}
		
		
        
		int[] class1 = new int[20];
		int[] class2 = new int[20];
		int[] class3 = new int[20];
		int[] class4 = new int[20];
		
		int[][] 천안 = new int [4][20];
		// int[][] >> int 배열의 배열이다
        // new int [배열의수][자식배열의 수]
		
		System.out.println("천안 : "+천안);
		System.out.println("천안 [0]: "+천안[0]);
		System.out.println("천안 [0][0]: "+천안[0][0]);
		
		//서로 다른 크기를 가지는 2차원 배열
		int[][] test = {
				{1,2,3},
				{1,2,3,4},
				{78}
		};
		//두번째 배열의 마지막 값 출력
		System.out.println(test[1][test[1].length-1]);
		System.out.println("test.length : "+test.length);
		System.out.println("test[0].length : "+test[0].length);
		System.out.println("test[1].length : "+test[1].length);
	    
		
		int[][] 수원 = new int [4][20];
		int[][] 서울 = new int [4][20];
		
		int[][][] 휴먼 = new int [3][4][20];
		
		//가상의 달력
		//12개월이고 모든 달은 30일까지만 있는
		//한달은 1~30
		//모든 날짜 채워 넣기
		//따로 모든(또는 11월)출력하기
		/*
		 * 전략
		 * 첫번째 배열이 12개월이고
		 * 두번째 배열이 30일까지 로
		 * 반복문을 사용하여 모든 날짜를 채워넣자
		 * 
		 */
		
		int[][] d = new int [12][30];
//		int[][] 달력 = {
//				{1{1~30},2{1~30},3{1~30},,,}
		
		 
		for(int e=0;e<d.length;e++) {
			 
			for(int e1=0;e1<d[e].length;e1++) {
			  System.out.println("월 : "+(e+1)+", 일 : "+(e1 +1));
		    }
		}
		
//		System.out.println("강사님풀이");
//		int day1 = 1;
//		int day2 = 2;
//		
//		int [] month1 = new int [30];
//		for(int i=0;i<month1.length;i++) {
//			month1[i] = i+1;
//		}
//		for(int i=0;i<month1.length;i++) {
//			System.out.print(month1[i]+",");
//		}
//		
//		int [] month2 = new int [12];
//		for(int i=0;i<month1.length;i++) {
//			month2[i] = i+1;
//		}
//		
//		int[][] month = new int [12][30];
//		for(int j=0;j<month.length;j++) {
//			for(int i =0; i<month[j].length;i++) {
//				month[j][i] = i+1;
//			}
//		}
		
		//랜덤
		//3~10
		int start = 3;
		int end = 10;
		
		double dRandom = Math.random(); //0~0.9999
		//0~7
		int iRandom = (int)(dRandom*(end - start +1));
		
		int result_random = iRandom + start;
		
		//한줄로
		int random = ((int)(Math.random()*(end - start +1)) ) + start;
	
		
//		String[] name2 = name1; //얇은복사
		
		// 배열을 깊은복사
		String[] name1 = {"김","이","박","최"};
		//name1 와 정확히 동일한 name2를 만드세요
		String[] name2 = new String[name1.length];
		for(int i=0;i<name1.length;i++) {
			name2[i] = name1[i];
		}
		
		
		//[3,4,7,5,1,4,6]
		/*
		 * 문제1. 홀수의 개수를 구하시오
		 * 문제2. 4보다 큰 수의 개수를 구하시오
		 * 문제3. 최대값 구하기
		 * 
		 * 문제4.두번째 최대값 구하기
		 * 문제5.배열을 하나씩 뒤(오른쪽)로 밀기
		 * 5-1 : 0으로 채우기
		 * 5-2 ; 첫자리에 마지막 것 넣기
		 * 문제6.임시비밀번호 8자리 만들기
		 * 6-1 :숫자로 랜덤
		 * 6-2 :소문자로 랜덤
		 * 6-3 :숫자 2개이상,대/소문자 조합
		 * 
		 * 문제 7.예약
		 * 자리가 10개 있는 소극장 예약 시스템
		 * 자리번호는 1~10번까지 번호의 자리가 있음
		 * 만약1: 예약이 가능하면 "n번자리 예약 했습니다"
		 * 만약2:예약이 불가능 하다면 "이미 예약 되있습니다"
		 * 메뉴 : "1.예약, 2.모든 좌석현황, 3.잔여좌석, 4.종료"
		 * 
		 * 문제 8 : 로또 6개 배열에 저장
		 *  단,중복없이
		 * 
		 */
		System.out.println("-----강사님1번---------");
		int[] arr = {3,4,7,5,1,4,6};
		int cnt = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i] %2 ==1) {
				cnt++;
			}
		}
		System.out.println("1.홀수의개수 :"+cnt);
		
		
		
		
		
		System.out.println("-----1번---------");
		
		int[] z1;
		int c1 = 0;
		z1 = new int[] {3,4,7,5,1,4,6};
		for (int x1 =0;x1<z1.length;x1++) {
			if (z1[x1]%2 !=0) {
				c1 +=1;
			}
		}    
		System.out.println(c1);
		
		
		System.out.println("------강사님2번--------");
		cnt =0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i] >4) {
				cnt++;
			}
		}
		System.out.println("2.4보다큰 개수 :"+cnt);
		
		
		
		
		System.out.println("------2번--------");
		
		int c2 = 0;
		for (int x1=0;x1<z1.length;x1++) {
			if(z1[x1]>4) {
				c2 ++;
			}
		}
		System.out.println(c2);
		
		System.out.println("------강사님3번--------");
		int max = Integer.MIN_VALUE; //-2147483648
		for (int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최대값 : "+ max);
		
		
		System.out.println("------3번--------");
		
		//배열된 값을 모두 출력했을 경우 비교가 가능하다
		//z1[x1]<z1[x1]
		//다음 반복값과 비교하도록
		
		max = z1[0];
		
		for (int x1 = 0; x1 < z1.length; x1++) {
			
			if (z1[x1] > max) {
				max = z1[x1];
			}
			
		}
		System.out.println(max);
		
		
		System.out.println("------4번--------");
		int ma = z1[0];
		int ma2 = z1[0];
		for (int x1 = 0; x1 < z1.length; x1++) {
			
			if (z1[x1] > ma) {
				ma = z1[x1];
				
				for (int x2 = 0; x2 < z1.length; x2++) {
					
					if (z1[x2] > ma2 && z1[x2] < ma) {
						ma2 = z1[x2];
						
					}
				}
				
			}
		}
		System.out.println(ma2);
		
		
		System.out.println("------5번--------");
		
//		
		
//		z1[1]=z1[0];
//		z1[2]=z1[1];
//		z1[3]=z1[2];
//		z1[4]=z1[3];
//		z1[5]=z1[4];
//		z1[6]=z1[5];
		int b1 = 0;
		
		for(int x=0; x<z1.length-1;x++) {
			z1[b1]=z1[x];
			b1 = x + 1;
//			System.out.println(z1[b1]);
			
			System.out.println(z1[x]);
			
			
		}
		
		System.out.println("------6번--------");
//		암호 8자리 만들기
//		반복문으로 8개의 랜덤돌리기
		
		
		int[] ran = new int [8];
		int y = 0;
		for(int x=0;x <ran.length;x++) {
         double ddRandom = Math.random();
			ran[x] = (int)(ddRandom*10); 
			System.out.println(ran[x]);
		}
		
		
		
	}	
 
}
