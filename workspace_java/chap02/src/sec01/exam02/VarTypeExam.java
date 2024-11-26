package sec01.exam02;

public class VarTypeExam {

	public static void main(String[] args) {
		
		byte b = 127;
//		b = 128;
		
	
//		byte b1 = 100;
//		byte b2 = 80;
//		b = b1 + b2;
	
	    long l1 = 10;
	    long l2 = 20L;
   
//	    long l3 = 10000000000;
	    long l4 = 10000000000L;
	    
	    char c1= 'A';
	    System.out.println("c1 : "+ c1);
	    
	    char c2= 67;
	    System.out.println("c2 : "+ c2);
	    
	    System.out.println("c2-c1 : "+(c2-c1));
	    
	    char c3 = 'a';
	    System.out.println("c3-c1 : "+(c3-c1));
	    
	    String s1 = "탁정현";
	    System.out.println("s1 : "+s1);
	    
	    String s2 = "\"탁정현\"";
	    System.out.println("s2 : "+ s2);
	    
	    String s3 = "번호\t이름";
	    String s4 = "번호2\t이름";
	    System.out.println("s3 :"+ s3 );
	    System.out.println("s4 :"+ s4 );
	    
	    String s5 = "홍길동\n김자바";
	    System.out.println("s5 : "+ s5);
	    
	    System.out.print(1);
	    System.out.print(2);
	    System.out.println(3);
	    
	    double d = 0.1234567890123456789;
	    System.out.println("d : "+ d);
//	    double의 경우 소수점 16자리 까지 정확 17자리부터는 
//	    18자리의 반올림한값
	    
	    float f = 0.1234567890123456789f;
	    System.out.println("f : "+ f);
//	    float은 7자리까지 정확 나머지는 반올림
	    
	    boolean b1 = true;
	    boolean b2 = false;
	    
	    
	    
	    
	}
	
 	
}


