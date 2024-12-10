package quiz;

public class SongExam {

	public static void main(String[] args) {

		//Song 클래스 생성
		//제목과 가수명을 넣고 출력
		//제목,가수명,좋아요수 출력
		Song song =new Song();
		song.title = "home sweet home";
		song.singer = "G-Dragon";
		
		System.out.println(song.title);
		System.out.println(song.singer);
		System.out.println(song.like);
		
		Song song1 =new Song();
		song1.title = "APT";
		song1.singer = "로제";
		
		System.out.println(song1.title);
		System.out.println(song1.singer);
		System.out.println(song1.like);
		
		Song song3 =new Song();
		song3.setTitle("Whiplash");
		System.out.println(song3.title);
		
		
		Song plus1 =new Song();
		double a = plus1.plus(1.5,2.5);
		double b =plus1.plus(a,2.5);
		System.out.println("정답은 :"+ b);
	}

}
