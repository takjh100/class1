package quiz;

public class MovieExam {

	public static void main(String[] args) {

		
//		new Movie(); //이걸로 생성못하고
//		new Movie("무파사"); //제목을 넣어야 생성되게
//		new Movie("무파사");
//		new Movie("무파사",2025);
		Movie film = new Movie("무파사",2025);
		film.MovieYear(null,2015);
		System.out.println(film.title);
		System.out.println(film.year);
		
		
		
		
		
		int[] a = {1,2,3};
		
		int [] b = new int [3];
		b[0] = 1;
		b[0] = 2;
		b[0] = 3;
		
		//클래스의 모든 정보를 출력하는 메소드
		//print 만들기
		//다음의 코드를 대신해주는 메소드
		System.out.println(film.title);
		System.out.println(film.year);
		
		film.print();
		
	}
}
	
	

