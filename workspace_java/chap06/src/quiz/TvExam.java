package quiz;

import java.util.Scanner;

public class TvExam {

	public static void main(String[] args) {

//		Tv tv = new Tv();
//		tv.powerOn();
		
		Tv tv = new Tv();
		tv.powerOn();
		tv.volUp();
		tv.volUp();
		tv.volDown();
		tv.cn(1000);
		tv.cnUp();
		tv.cnDown();
		tv.display();
		
	}
}
