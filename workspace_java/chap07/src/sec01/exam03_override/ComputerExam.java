package sec01.exam03_override;

public class ComputerExam {

	public static void main(String[] args) {

		Calc calc = new Calc();
		int a = calc.plus(1, 3);
		System.out.println("calc.plus�� ���"+ a);
		System.out.println(calc.areaCircle(10));
		
		System.out.println("---------");
		Computer computer = new Computer();
		int b = computer.plus(10, 30);
		System.out.println("computer.plus�� ���" + b);
		System.out.println(computer.areaCircle(10));
	}

}
