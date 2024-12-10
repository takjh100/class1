package sec03.exam01;

public class KimbobExam {

	public static void main(String[] args) {

		Kimbob 천안역점 = new Kimbob(1000);
		천안역점.order(0);
		
		천안역점.print(0,3);
		천안역점.menupuls("돈까스",9000);
		천안역점.menupuls("제육덮밥",8000);
		
		천안역점.PrintMenu();
	}

}
