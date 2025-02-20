package sec02.exam01;

public class LunchExam {

	public static void main(String[] args) {

		Lunch lunch = new LunchImpl();
		lunch.order(null);
		
		
		
		//익명함수
		Lunch lunch2 = new Lunch() {

			@Override
			public int order(String menu) {
				// TODO Auto-generated method stub
				return 0;
			}
			};
		
	}

}
