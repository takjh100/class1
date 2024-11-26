package sec01.exam02;

public class VariavleuseExam {

	public static void main(String[] args) {

		
	int hour = 3;
	int minute = 5;
	System.out.println(hour + "시간" + minute + "분");
	
	int totalMinute = (hour * 60) + minute;
	System.out.println("총" + totalMinute + "분");
	
	int totalSec = totalMinute * 60;
	System.out.println(totalSec);
	
	int x = 10;
	int y = 20;
	
	System.out.println("x의 값:" + x);
	System.out.println("x+y의 값:"+ (x+y));
	x = y;
	System.out.println("x+y의 값:"+ (x+y));
	System.out.println("x의 값:" + x);
	
	//System.out.println(j);
//	j가 선언되지 않아 에러
	int j = 1;
	System.out.println("j :"+ j);
	//syso + Ctrl + 스페이스바 = System.out.println
	{
        System.out.println("j :"+ j);	
	}
	{
		int i = 0;
		System.out.println("i :"+ i);
	
		//같은 변수명으로 또 선언할 수는 없다.
//	    int i = 100;
//	    int j = 10;
		i=100;
		j=10;
	}
//	    System.out.println("i :"+ i); 로컬변수- {}중괄호(지역,로컬)
//	사이가 아닌 경우 사용불가
	}

}
