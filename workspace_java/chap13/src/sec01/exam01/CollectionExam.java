package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class CollectionExam {

	public static void main(String[] args) {

		List list =  new ArrayList();
		System.out.println(list.isEmpty());
		
		//�߰�
		list.add(10);
		list.add("�۾�");
		
		//�߰��� ����
		list.add(1,123);
		System.out.println(list);
		
		//��üũ��
		System.out.println(list.size());
		

		//����
		list.remove(1);
		System.out.println(list);
		
		//�б�
		int a = (int)list.get(0);
		System.out.println(a);
		
		//�ʱ�ȭ
//		list.clear();
		list = new ArrayList();
		
	}

}
