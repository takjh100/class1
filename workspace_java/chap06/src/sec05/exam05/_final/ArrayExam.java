package sec05.exam05._final;

public class ArrayExam {

	public static void main(String[] args) {

		int[] a = new int[5];
		a[0] = 1;
		
		//�����ϰ� ���� 
		//add()�� ���� ������ �ڵ����� ���� index�� �߰�
		//   ��, ũ�⸦ ����� "���� ���� ���"
		//get()�� index�� ������ �� index�� ���� return��
		
		Array array = new Array(3);
		array.add(10000);
		array.add(1234);
		array.add(2);
		array.add(3);
		
		int b = array.get(1);
		System.out.println(b);
	}

}
