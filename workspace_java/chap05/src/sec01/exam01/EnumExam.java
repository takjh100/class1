package sec01.exam01;

public class EnumExam {

	public static void main(String[] args) {

		
		Week week;
		//week_m은 사용자가 입력한 값
		Week week_m = Week.월;
		
		if(week_m == Week.월) {
			System.out.println("월요일");
		}else if (week_m == Week.화) {
			System.out.println("화요일");
		}
		//p230 Calender 예시로 이해
		
		
	}

}
