package sec01.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		System.out.println("-------------------");
		
	     HashMap map1 = new HashMap();
	     Map map = new HashMap();
	     
	     //�߰�
	     map.put("k1", 10);
	     map.put("abc", list);
	     
	     //��������
	     int k1 = (int)map.get("k1");
	     System.out.println(k1);
	     // key�� ���� ��� null
	     System.out.println(map.get("k2"));
	     
	     //�ʱ�ȭ
	     map = new HashMap();
	     
	     //����Ʈ�� map�ֱ�
	     list = new ArrayList();
	     
	     map = new HashMap();
	     map.put("����", "����");
	     map.put("����", "���");
	     list.add(map);

	     map = new HashMap();
	     map.put("����", "�ٶ��� �д�");
	     map.put("����", "�̼Ҷ�");
	     list.add(map);
	     
	     System.out.println(list);
	     
	     // ���׸� <String>
	     // 60��¥�� ����: �߰��� �ڷ����� �����ϴ� �뵵�� ���δ�.
	     // 100��¥�� ���� : �������ڳ� ����Ÿ���� �ڷ����� �������� �����Ѵ�
	     List<String> list1 = new ArrayList<String>();
	     list1.add("abc");
//	     list1.add(123);
	     String str = list1.get(0);
	     
	     //���׸��� int �� ����Ÿ���� ����� �� ���� wrapper Ŭ���� ���
	     Map<String, Integer> map2 = new HashMap<String, Integer>();
	     map2.put("str", 123);
	     int c = map2.get("str");
	     
	     
		
	}

}
