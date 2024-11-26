package sec01.exam02;

public class typeCastingExam {

	public static void main(String[] args) {
		int a = 2 + (3 * 4);  //여기서 ()는 우선순위
		long b = (long)a;    // 여기서 ()는 형변환 연산자
		long c = a;          //int가 iong보다 작으니깐
//		형 변환해도 손해가 없어 생략 가능
		System.out.println("a : "+a);
		
	    long d = 3000000000L;
	    int e = (int)d;
	    System.out.println("e : "+e);
	    //long을 int로 변화하는 경우
	    //8byte 중에서 상위 4byte만 남기기 때문에
	    //예측하지 못한 값이 나올 수 있어서
	    //[생략 불가능]
	    
	    int g = 3;
	    long h = 4L;
	    long i = (long)g + h;
	    long i2 = g + h;
//	    타입이 다른경우 큰 타입으로 자동 변환되어 연산된다
	    
	    double j = 3.3;
	    double k = (double)g + j;
	    double k2 = g + j;
	    System.out.println("(double)g : "+(double)g);
	    
	    int j2 = (int)j;
	    System.out.println("(int)j :"+(int)j);
	    
	    double total = 4.3;
	    int count = 4;
//	    total (단위 만원)은 회식비입니다
//	    count는 참석인원입니다
//	    참석인원은 만원단위로만 회식비를 낸다
//	    이때 인당 얼마를 내야하는지 출력하시오
	    
	    int p = (int)total/count;
	    System.out.println("(int)p : "+(int)p);
//	    인트를 더블로 바꾸는게 적합하다
//	    더블을 인트로 바꾸는 과정에서 소수점자리가 손실되기 때문
	    double d_result = total/(double)count;
	    int i_result = (int)d_result;
	    System.out.println("(int) i_result : "+(int) i_result);
	    
//	    깜짝문제
	    //그럼 주최자는 얼마를 내야하는가?
	    
	    double m_result = total-((int)i_result*count-1);
	    System.out.println("(double) m_result : "+(double) m_result);
	    
	    
	    
	    /*진짜문제
	     * 
	     * String a1 = "수박";
	       String b1 = "볼링공";
	     * 
	     *a = "볼링공" 금지
	    		 
	     * System.out.println( a ); //"볼링공"
	     * System.out.println( b ); //"수박"
	     */
	    String a1 = "수박";
	    String b1 = "볼링공";
	    System.out.println("a1 : "+a1+",b1 :"+b1);
	    
	    String temp = a1;
	    
	    a1 = b1;
	    b1 = temp;
	    System.out.println("a1 : "+a1+",b1 :"+b1);
	    
	
	
	}
	
}

