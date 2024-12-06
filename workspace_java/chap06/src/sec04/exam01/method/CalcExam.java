package sec04.exam01.method;

public class CalcExam {
    //전달인자 선언의 () 
	public static void main(String[] args) {

		Calc calc = new Calc();
		calc.powerOn(); // 실행의 ()
		System.out.println("calc.isOn : "+calc.isOn);
		calc.powerOff();
		System.out.println("calc.isOff : "+calc.isOn);
		
		int b = 7;
		int a = calc.plus(b,10);
		System.out.println("a : "+a);
		
		double c = calc.divide(10, 0);
		System.out.println("c : "+c);
		
		
		Calc[] d = new Calc[10];
		d[0] = new Calc();
		
		
		Calc[] d1 = new Calc[2];
		d1[0] = new Calc();
		Calc[] d2 =  {new Calc(),new Calc()};
		
		int[] f = {1,2,3,4,5};
		int f1 =calc.sum1(f);
		System.out.println("f1 : "+f1);
		
		int f2 = calc.sum2(f);
		int f3 = calc.sum2(1,2,3,4,5);
		System.out.println("f2 : "+f2);
		System.out.println("f3 : "+f3);
		
		
	}

}
