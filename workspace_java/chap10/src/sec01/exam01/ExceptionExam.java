package sec01.exam01;

import org.w3c.dom.events.EventTarget;

public class ExceptionExam {

	public static void main(String[] args) {
		
		for(int i=0;i <args.length; i++) {
			System.out.println("args[i] :" + args[i]);
		}
		
		int a = 10;
//		String b = ""+a;
		String b = "100asd";
		try {
			a = Integer.parseInt(b);
			
			Class clazz = Class.forName("java.lang.Sreing2");
			
			
			System.out.println("�̰� ��µȴٴ°� ���� ���ܰ� ������");
		} catch (NumberFormatException e) {
			System.out.println("catch ��");
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("finally ������ ����");
		}
		
		System.out.println("and");
	}
}
