package quiz;

public class Movie {

	//생성자 선언 : 클래스명 (전달인자들){  }
	String title;
	int year;
	
	Movie(String x) {}
	
	Movie(String x,int y) {
		this.title = x;
		this.year = y;
	}
	void MovieYear (String x,int y) {
		
		if(x != null) {
		this.title = x;
		this.year = y;
		}else {
			System.out.println("제목을 정확히 입력해 주세요");
		}
	}
	
	void print () {
		System.out.println("제목 : "+this.title);
		System.out.println("개봉일 : "+this.year);
	}

}