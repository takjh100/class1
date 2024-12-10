package quiz;

public class CalcExam {

	public static void main(String[] args) {

		
		Calc calc = new Calc();
		calc.compute(1,"-",2.5);
		
		System.out.println("결과 : "+calc.result);
		
	}

}
