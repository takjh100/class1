package sec01.exam01;

public class CarExam {

	public static void main(String[] args) {

		Car mycar = new Car();
		
		String m = mycar.model;
		
		System.out.println(m);
		
		Car mycar2 = new Car();
		mycar2.model = "흑팔라";
		
		System.out.println(mycar.model);
		System.out.println(mycar2.model);
		System.out.println(mycar2.speed);
		System.out.println(mycar);
		
		
	}

}
