package sec01.exam01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		
		int score = 73;
//		Scanner scan = new Scanner (System.in);
//		int score = scan.nextInt();
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
	    }
		
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
			
		}
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
	    } else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
			
		}
				
		if(score >= 90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A입니다.");
	    } else if (score < 90 && score >= 80) {
			System.out.println("점수가 89~80 입니다.");
			System.out.println("등급은 B입니다.");
			
		} else if (score < 80 && score >= 70) {
			System.out.println("점수가 79~70 입니다.");
			System.out.println("등급은 C입니다.");
			
		}  else {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D입니다.");
			
		}
		
		//문제1
		//z1 이 x1 과 y1 사이에 있는지 확인
		int x1 = 15;
		int y1 = 20;
		int z1 = 17;
		boolean r1 = (z1 >= x1);
	    boolean r2 = (z1 <= y1);
		if(r1 && r2) {
			System.out.println(z1 + ": 사이에 있다");
		} else {
			System.out.println(z1 + ": 사이에 없다");
		}	
		int x3 = 3;
		if((x3 % 2) == 0) {
			System.out.println(x3 + ": 짝수");
		}else {
			System.out.println(x3 + ": 홀수");
		}
		//문제 2
		/* 
		 * 어제 온도가 -3 였을때
		 * 오늘 온도(입력 받아도 됨)가
		 * 
		 * 영하인지 영상인지
		 * 만약 영하라면 "영하 1도입니다"
		 * 영상이라면 "영상 2도 입니다"
		 * 
		 * "어제보다 온도가 높습니다"
		 * "어제보다 온도가 낮습니다"
		 * 
		 * "어제보다 2도 높습니다"
		 */
		int yt = -3; //어제 온도
		int t = -1; //오늘 온도
		int o = 0;
		if (t >= 0){
		System.out.println("영상"+ (t)+"도 입니다.");	
		} else {
			System.out.println("영하"+ (t - o)+"도 입니다.");	
		}
		if (yt > t) {
			System.out.println("어제보다 온도가 낮습니다");
			System.out.println("어제보다 "+(yt-t)+"도가 낮습니다");
		}else {	
			System.out.println("어제보다 온도가 높습니다");
			System.out.println("어제보다 "+(t-yt)+"도가 높습니다");
		}
		
			
		
		//문제 3
		/*
		 * 어떤 수가 있을때 
		 * 
		 * "입력한 수는 100보다 큰/같은/작은 수이며
		 * 양수/음수이고
		 * 홀수입니다"
		 */
		
		int p = 30;
		boolean p1 = p > 100;
		boolean p2 = p == 100;
		boolean p3 = p < 100;
		boolean l1 = p >= 0;
		boolean l2 = p < 0;
		int l3 = (p % 2);
		if (p1) {
			System.out.println("입력한 수는 100보다 작은수이며");
		}else if (p2) {
			System.out.println("입력한 수는 100보다 같은수이며");
			
		}else if (p3) {
			System.out.println("입력한 수는 100보다 작은수이며");
			
		} if (l1) {
			System.out.println("양수이고");
			
		}else {
			System.out.println("음수이고");
			
		}if (l3 == 0) {
			System.out.println("짝수입니다");	
		}
		else {
			System.out.println("홀수입니다");
		}
			

			
		
		
		
		//문제 4
		/*
		 * a,b 두 수가 있을때
		 * 둘중에 큰 값 출력
		 */
		int a = 2;
        int b = 3;
        if (a > b) {
        	System.out.println("a 와 b 중 더 큰값은 a : "+ a +"입니다.");
        }else {
		    System.out.println("a 와 b 중 더 큰값은 a : "+ b +"입니다.");
        }
	
		//문제 5
		/*
		 * 숫자가 
		 * 1일 때 "일"
		 * 2일 때 "이"
		 * 3일 때 "삼"
		 * 다른 수일때 "그 외" 출력
		 */
		int n1 = 4;
		if (n1 == 1) {
			System.out.println("일");
			
		}else if (n1 == 2) {
			System.out.println("이");
		}else if (n1 == 3) {
			System.out.println("삼");
		}else {
			System.out.println("그 외");
		}
		
		//문제 6
		/*
		 * 월에 따라서
		 * 4계절을 출력
		 * 3~5 봄
		 * 6~8 여름
		 * 9~11 가을
		 * 12~2 겨울
		 */
	     int v = 1;
	     boolean v1 = (v >= 3) && (v <= 5);
	     boolean v2 = (v >= 6) && (v <= 8);
	     boolean v3 = (v >= 9) && (v <= 11);
//	     boolean v4 = v >= 12 && v <=2;
	     if (v1) {
	    	 System.out.println("봄");
	     }else if (v2) {
	    	 System.out.println("여름");
	     }else if (v3) {
	    	 System.out.println("가을");
	     }else  {
	    	 System.out.println("겨울");
	     }
	     
	     //어려운 문제1
	     //두자리 정수가
	     //10의 자리와 1의 자리가 같은지 판단
	     int num = 33;  //같음
	     num =65;      //다름
	     int num1 = (num/10);
	     int num2 = num -(num1 *10);
	     if (num1 ==num2) {
	    	 System.out.println("같다");
	     }else {
	    	 System.out.println("다르다");
	     }
	     
	     
	     //어려운 문제2
	     //사각형의 한쪽 모서리 : (10,20)
	     //다른쪽 모서리 : (90,100)
	     //새로운 점 : xc, yc가 사각형에 포함 되는가?
	     
	     //x축으로 지정 , y 축으로 지정한 경우로 보고
	     // 새로운 점이 두 모서리를 찍는 사각형 사이에 
	     //x축,y축이 동일하게 &&로 들어가는지 확인
	     int x = 10;
	     int y = 20;
	     int xb = 90;
	     int yb = 100;
	     int xc = 40;
	     int yc = 90;
	     boolean xx = xc >= x && xc <= xb;
	     boolean yy = yc >= y && yc <= yb;
	     
	     if (xx && yy) {
	    	 System.out.println("들어간다");
	     }else {
	    	 System.out.println("들어가지않는다");
	     } 
	    
	     
	     //random 사용법
	     /*
	      *Math.random();
	      *0 <= Math.random() < 1 
	      *
	      * 주사위 : 1 ~6
	      * (0 ~ 5) + 1
	      * x + 1 = y -2 
	      * x + 1 +2 = y -2 +2 
	      * 
	      *0 <= Math.random() < 1 
	      *0*(5+1) <= Math.random()*(5+1) < 1*(5+1) 
	      * 0~5.9999999 
	      * (int) 0~5
	      */
          
	     double rand = Math.random();
	     System.out.println("rand : "+ rand);
	     
	     double rand2 = Math.random()*(5+1);
	     int rand3 = (int)rand2; //0~5
	     int rand4 = rand3 + 1; //1~6
	     System.out.println("주사위 : "+ rand4);
	     
	     
	     //쉽게 사용하기
	     int rnd1 = (int) (Math.random() * 60);
	     int rnd2 = rnd1 % 6;
	     int rnd3 = rnd2 + 1;
	     
	     //가위 바위 보 게임
	     
	     Scanner scan = new Scanner (System.in);
			int sc = scan.nextInt();
         System.out.println(sc);	
	     
	     
	     double ran = Math.random();
	     double ran2 = Math.random()*(3);
	     int ran3 = (int)ran2;
	     int ran4 = ran3 + 1;
	     
	     if (sc == 1 && ran4 == 1) {
	         System.out.println("가위로 비겼습니다");	
	     }else if (sc == 1 && ran4 == 2) {
		     System.out.println("가위로 졌습니다");	
         }else if (sc == 1 &&ran4 == 3) {
		     System.out.println("가위로 이겼습니다");	
         }else {
        	 System.out.println("없음");  
         }
	     
	     if (sc == 2 && ran4 == 1) {
	         System.out.println("바위로 이겼습니다");	
	     }else if (sc == 2 && ran4 == 2) {
		     System.out.println("바위로 비습니다");	
         }else if (sc == 2 &&ran4 == 3) {
		     System.out.println("바위로 졌습니다");	
         }else {
        	 System.out.println("없음");  
         }
	     
	     if (sc == 3 && ran4 == 1) {
	         System.out.println("보로 졌습니다");	
	     }else if (sc == 3 && ran4 == 2) {
		     System.out.println("보로 이겼습니다");	
         }else if (sc == 3 &&ran4 == 3) {
		     System.out.println("보로 비겼습니다");	
         }else {
        	 System.out.println("없음");  
         }
	     
	     
         
//	     if (sc == 1 && ran4 == 1) {
//	         System.out.println("가위로 비겼습니다");	
//	     }else if (sc == 1 && ran4 == 2) {
//		     System.out.println("가위로 졌습니다");	
//         }else if (sc == 1 &&ran4 == 3) {
//		     System.out.println("가위로 이겼습니다");	
//         }else {
//        	 System.out.println("없음");  
//         }
//	     
//	     if (sc == 2 && ran4 == 1) {
//	         System.out.println("바위로 이겼습니다");	
//	     }else if (sc == 2 && ran4 == 2) {
//		     System.out.println("바위로 비습니다");	
//         }else if (sc == 2 &&ran4 == 3) {
//		     System.out.println("바위로 졌습니다");	
//         }else {
//        	 System.out.println("없음");  
//         }
//	     
//	     if (sc == 3 && ran4 == 1) {
//	         System.out.println("보로 졌습니다");	
//	     }else if (sc == 3 && ran4 == 2) {
//		     System.out.println("보로 이겼습니다");	
//         }else if (sc == 3 &&ran4 == 3) {
//		     System.out.println("보로 비겼습니다");	
//         }else {
//        	 System.out.println("없음");  
//         }
	     
	     
	     
	     
	     
        	 if (ran4 == 1) {
	         System.out.println("가위");	
	     }else if (ran4 == 2) {
		     System.out.println("바위");	
         }else if (ran4 == 3) {
		     System.out.println("보");	
         }else {
        	 System.out.println("없음");
          
         }
	
	}	 
	
           
}	


