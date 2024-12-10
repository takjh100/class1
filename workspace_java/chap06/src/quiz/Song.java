package quiz;

public class Song {

	String title; 
	String singer;
	int like;
	
	
	/**
	 * title을 변경하는 메소드 만들기
	 * setTitle
	 * 
	 * @param String
	 * @return void
	 * 
	 */
	
	void setTitle (String title) {
		this.title = title;
	}
	
	//double 두개를 더하기한 결과를 돌려주는 메소드를 만드시오
	
	double plus (double x, double y) {
		double result = x + y;
		System.out.println(result);
		return result;
	}
	
	
}
