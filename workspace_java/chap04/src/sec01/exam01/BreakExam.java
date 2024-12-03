package sec01.exam01;

import java.util.Scanner;

public class BreakExam {

	public static void main(String[] args) {

		
	    int gn= 0;
		while (true) {
			int num = (int) (Math.random() *6) +1;
		System.out.println(num);
		
		if(num == 6){
			break;
		}gn ++;
	  }
		
	  System.out.println("게임 종료");
	  System.out.println("게임횟수 :"+gn);
		
      for(int i = 0; i<5; i++) {
    	  System.out.println("i : "+ i);
    	  for(int j = 0; j<3; j++) {
    		  if(j >= 2) {
    			  break;
    		  }
        	  System.out.println("j : "+ j);
    	  } System.out.println(); 
      } 
      boolean isStop = false;  
      for(int i = 0; i<5; i++) {
          System.out.println("i : "+ i);
          for(int j = 0; j<3; j++) {
        	  if(j >= 2) {
                  isStop = true;
        		  break;
        	  }
             System.out.println("j : "+ j);
          } 
          if(isStop) {
        	  break;
          }
          System.out.println(); 
      }
      
      
      for (int i=1; i<=10; i++) {
    	  if( i % 2 == 0) {
    		  System.out.println(i);
    	  }
      }
      
      for (int i=1; i<=10; i++) {
    	  if( i % 2 != 0) {
    		 continue;
    	  }
          System.out.println(i);
      }
      
      
      /*
       * 1.예금
       * 예금액이 음수 불가
       * 2.출금액이 음수불가
       * 잔고보다 큰 금액 불가
       * 
       */
     
     
      Scanner scan = new Scanner(System.in);
//      int balance = 0;

//      do {
//      System.out.println("------------------");
//      System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
//      System.out.println("------------------");
//      int menu = scan.nextInt();
//
//      if(menu == 1) {
//      System.out.println("예금액 : ");
//      int input = scan.nextInt();
//      if(input > 0) {
//      balance += input;
//      } else {
//      System.out.println("예금액을 확인해주세요");
//      }
//      } else if(menu == 2) {
//      System.out.println("출금액 : ");
//      int output = scan.nextInt();
//      if(output < 0 || balance < output) {
//      System.out.println("출금액을 확인해주세요");
//      } else {
//      System.out.println("출금액 : "+ output);
//      balance -= output;
//
//      System.out.println("출금 후 잔액 : "+ balance);
//      }
//      } else if (menu == 3) {
//      System.out.println("잔액 : "+ balance);
//      } else if(menu == 4) {
//      break;
//      }
//
//      }while( true );
//
//      }
//
//}
      
       int bm = 0;
    do {
    	System.out.println("---------------");
    	System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
    	System.out.println("---------------");
    	int menu = scan.nextInt();
    	if(menu == 1) {
    	System.out.println("예금액 :");
    	int p = scan.nextInt();
    	//예금
    	if(p > 0) {
    		System.out.println("예금액 :"+p);
    		bm += p;
    	}else {
    		System.out.println("예금액을 확인해 주세요");
    	}
    	}else if(menu == 2) {
    		System.out.println("출금액 :");
    		int m = scan.nextInt();
    	if(m < 0 || m > bm) {
    		System.out.println("출금액을 확인해 주세요");
    	}else {
    		System.out.println("출금액 :"+m);
    		bm -= m;
    	}
    	}else if (menu == 3) {
    		System.out.println("잔액 :"+bm);
    	}else if (menu == 4){
    		System.out.println("거래를 종료합니다");
            break;  	
    	}
    }while (true);
    			   

      
      
      
     

      
      //로또 : 1~45의 숫자 중
      //중복되지 않은 수 6개 고르기
     double rand = 0.0;
      /*
       * 0 이상 1 미만
       */
     rand = Math.random();        //0~0.9999999999
     double temp1 = (rand * 45); //0~44.999999999
     int temp2 = (int)temp1;     //0~44
     
     int lotto1 = temp2 + 1;     //1~45
     System.out.println(lotto1); 
     
     
     
	}   
      
}
