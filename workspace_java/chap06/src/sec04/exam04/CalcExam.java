package sec04.exam04;

public class CalcExam {

	public static void main(String[] args) {

		Calc calc = new Calc();
		calc.execute();
		
		//메소드의 리턴을 사용하거나 말거나 그건 사용측 마음이다
		calc.plus(1, 2); //다음줄이 되면 3이라는 결과는 사라진다
		int plue = calc.plus(1, 2); //사용하고싶다면 변수에 담아서 사용
		System.out.println(plue);
		
		calc.plus(10.5, 20.3);
		
		int a = 10;
		double b =20.3;
		calc.plus(a, b);
		
		System.out.println("문자");
		System.out.println(1);
		System.out.println(1.5);
	}

}
