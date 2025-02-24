package sec01.exam02;

public class StringExam {

	public static void main(String[] args) {

		String s1 = "�����̻�����ĥ�ȱ����";
		
//		char a = 'a';
		char c = s1.charAt(0);
		System.out.println("char c :"+c);
		
		//���ʺ��� ù��° ��ġ�ϴ� �ε����� ������ 
		//������ -1
		int i = s1.indexOf("���");
		System.out.println("indexOf : "+i);
		int i2 = s1.indexOf("a");
		System.out.println("indexOf ���°�: "+i2);
		
		//�����ʺ��� ù��° ��ġ�ϴ� �ε����� ������
		int i3 = s1.lastIndexOf("���");
		System.out.println("lastindexOf : "+i3);
		
		//�̸��� ��� ����
		//@�� .�� �ϳ� �̻� �־�� ��Ȯ�� �̸��� �ּ� ����̶�� �Ǵ�
		String email = "todair@Human.or.kr"; 
		
		int a = email.indexOf("@");
		int b = email.indexOf(".");
		
		if(a != -1 && b >= 0) {
			System.out.println("�̸��� ������ �½��ϴ�");
		}else {
			System.out.println("�̸��� ������ �ƴմϴ�");
		}
		
		//�ε������� ���� ����
//		for(int j=0; j< s1.length(); j++) {
//			char c1 = s1.charAt(j);
//			if(c1 == '@') {
//				//�ε��� ��� �Ǵ� �����ϴ� �޼ҵ�
//				return;
//			}
//		}
		
		
		//ù��° �������ڸ� �ι�° �������ڷ� ��� �ٲ���
		String s2 = s1.replace("���", "34");
		System.out.println("s1 :"+ s1);
		System.out.println("s2 :"+ s2);
		// replace�� ���� �ٲ��ش�
		// ���ı��Լ�
		
		//���� index���� ����index �ٷ� �ձ��� �߶� ������
		String s3 = s1.substring(2,4);
		System.out.println("substring(2,4) :" +s3);
		
		//���� ��,�� �� ����ϱ�
		String ssn = "123456-1234567";
		
		String ssn1 = ssn.substring(7,8);
        
		if(ssn1.equals("1") || ssn1.equals("3")) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		// trim : �յ� ���鸸 ����, �߰� ������ �������� ����
		String s5 = " �۾�   �߰�����    ";
		System.out.println("["+s5+"]");
		System.out.println("["+s5.trim()+"]");
		
		// split: �����ڷ� �۾��� �߶� �迭�� �����ش�
		//        �����ڴ� �����
		// split�� �������ڴ� String�� �ƴ϶� ����ǥ����
		// ����ǥ������ ������ڴ� �׳� ���� �ȵȴ�
		// �������÷� Ż���Ű�ų� []�����ش�
		String menu = "�ƹ��ų�,Ǯ����,�ܹ���";
		String[] menus =  menu.split(",");
		for(String m : menus) {
			System.out.println(m);
		}
		
		String url = "cafe.naver.com";
//		String[] urls =  menu.split(".");
		//[]�� ���ΰų�
		String[] urls =  menu.split("[.]");
		//�������� �ΰ�
//		String[] urls2 =  menu.split("//.");
		System.out.println(urls.length);
		
//		����1
//		������ query string�� ���Ե� ���̹��� �˻� �ּ��Դϴ�
//		�˻����� key ���� query�Դϴ�.
//		�˻�� ����ϼ���
		String search = "https://search.naver.com/search.naver?where=nexearch&sm=top_sug.pre&fbm=0&acr=1&acq=grok&qdt=0&ie=utf8&query=grok3";

		int sc1 = search.indexOf("query");		
		
		// ����2
		// html �Ӽ� class�� cl�� text�� ������
		// target�� class�� �����ϴ��� �Ѵ�
		String cl = "red bigy px";
		String target = "big";
	
		//�Ʒ� �ڵ�ó�� �ϸ� �޸𸮰� ����ȴ�
		String a1 = "a";
		a1 += "b";
		
		//�޸𸮸� ȿ�������� ����Ѵ�
		//�����忡 �����ϴ�
		StringBuffer sb = new StringBuffer("abc");
		sb.append("defg");
		String d = sb.toString();
		
	
	}
	
	

}
