package quiz;

public class Calc {

	
	//+ - * / %
	//각각 메소드 만들기
	
	//+
	double result;
	
	int plus (int x, int y) {
		int result = x+y;
		System.out.println(result);
		return result;
	}
	double plus (int x, double y) {
		double result = x+y;
//		System.out.println(result);
		return result;
	}
	
	int minus (int x, int y) {
		int result = x-y;
		System.out.println(result);
		return result;
	}

	double minus(double x, double y) {
		double result = x - y;
		System.out.println(result);
		return result;

	}
	
	int times (int x, int y) {
		int result = x*y;
		System.out.println(result);
		return result;

	}
	double times (double x, double y) {
		double result = x*y;
		System.out.println(result);
		return result;
		
	}
	
	double division (double x, double y) {
		double result = x/y;
		System.out.println(result);
		return result;
	}
	
	double Percent (double x, double y) {
		double result = x%y;
		System.out.println(result);
		return result;
	}
	
	
	/**
	 * compute
	 * 
	 * @param int x,String z,double y
	 * @return void
	 */

	void compute(int x, String z, double y) {
		if(z == "+") {
		this.result = plus(x, y);
		System.out.println(x+" + "+y+" : "+result);
		}else if (z == "-") {
			this.result = minus(x, y);
			System.out.println(x+" - "+y+" : "+result);
		}else if (z == "*") {
			this.result = times(x, y);
			System.out.println(x+" * "+y+" : "+result);
		}else if (z == "/") {
			this.result = division(x, y);
			System.out.println(x+" / "+y+" : "+result);
		}else if (z == "%") {
			this.result = Percent(x, y);
			System.out.println(x+" % "+y+" : "+result);
		}else {
			System.out.println("제대로 입력해 주세요");
		}
		
    }
}