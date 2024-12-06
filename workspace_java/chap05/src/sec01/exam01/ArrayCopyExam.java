package sec01.exam01;

import java.util.ArrayList;

public class ArrayCopyExam {

	public static void main(String[] args) {

		//1호점에서 판매하는 메뉴
	    String[] menu1 = new String[3];
	    menu1[0] = "따아";
	    menu1[1] = "말차";
	    menu1[2] = "라떼";
	    
	    //2호점에서 1호점과 똑같은 메뉴를 판매할겁니다.
	    /*
	     * 얕은 복사
	     * shallow copy, thin copy,call by reference
	     * stack 영역의 값 (주소)만 복사
	     * 값을 변경할 경우 원본이 바뀐다
	     * 
	     */
		String[] menu2 = menu1;
		//얕은복사로 연결되어있어서
		//즉, 주소값만 공유하는 거라서
		//복사본을 바꿔도 원본이 바뀐다
		menu2[2] = "바나나라떼";
		System.out.println("menu1[2] : "+menu1[2]);
		
		/*
		 * 깊은 복사
		 * deep copy, deep clone, call by value
		 * 전혀 다른 heap영역에 똑같은 내용으로 채워놓음
		 * 원본과 복사본은 전혀 다른 객체
		 */
	    String[] menu3 = new String[menu1.length];
	    for(int i =0; i<menu1.length; i++) {
	    	menu3[i] = menu1[i];
	    }
	    menu3[2] = "연유라떼";
	    System.out.println("menu1[2] : "+ menu1[2]);
	    System.out.println("menu3[2] : "+ menu3[2]);
	    
	    //3호점에서만 "사라다빵"을 추가로 팔고 싶다. 	
		/*
		 * 전략
		 * menu3 보다 크기가 1개 많은 새로운 배열을 만들고
		 * 앞부분은 깊은 복사 해놓고
		 * 마지막에 "사라다빵"을 수동으로 추가해보자
		 */
	    menu3 = new String[menu1.length +1];
	    for(int i =0; i<menu1.length; i++) {
	    	menu3[i] = menu1[i];
	    }
	    menu3[menu3.length -1] = "사라다빵";
	    for(int i =0; i<menu3.length; i++) {
	    	System.out.println(menu3[i]);
	    }
	    
	    
	    //ArrayList 사용법
	    ArrayList list = new ArrayList();
	    //추가
	    list.add(1);
	    list.add("문자");
	    list.add(false);
	    
	    //사용
	    System.out.println(list.get(0) );
	    System.out.println(list.get(1) );
	    System.out.println(list.get(2) );
	    //list를 추가한 순서대로 인덱스로 관리 
	    
	    //사이즈
	    System.out.println( list.size());
	    
	    System.out.println(list);
	    
	    
	    //향상된 for문
	    for(String menu : menu3) {
	    	System.out.println("meun : "+menu);
	    }
	    
	    
	    //p223 문제5
	    //합
	    //평균 :합/개수
	    //최대값
	    
	    int[][] array = {
	    		{95, 86},
	    		{83,92,96},
	    		{78,83,93,87,88}
	   
	    }; 
	    
	    int sum =0;  //합
	    double avg = 0.0; //평균
	    int cnt = 0; 
	    int max = -1;

	    for(int i=0; i<array.length; i++) {
	    	for(int u=0; u<array[i].length; u++) {
	    		sum += array[i][u];
	    		cnt++;
	    	if(max <array[i][u]) {
	    		max = array[i][u];
	    	}
	    	
	    	} 
	    }
	    avg = (double)sum/cnt;
	    System.out.println("합 : "+sum);
	    System.out.println("평균 : "+avg);
	    System.out.println("최대값 : "+max);
	    
	    
	}

}
