package sec05.exam05._final;

public class Array {

//	int[] a = new int[3];
//	Array() {
//		System.out.println(a.length);
//		a.length// final ���� ����
//		
//	}
	final int length;
	int[] arr;
	int cursor = 0;
	
	//length �� �迭�� ũ��
	Array(int length) {
	   this.length = length;
	   arr = new int[length];
	}
	//add �� ���� �ִ� �޼ҵ�
	void add(int x) {
		if(this.cursor < this.length) {
			arr[this.cursor] = x;
			cursor++;
		}else {
			System.out.println("�迭�� �ڸ��� �����ϴ�");
		}
	}
	//�ε����� ���� �־����� �ش� �ε��� �迭�� ���� ����
	int get(int index) {
		if(index < this.length) {
			return arr[index];
		}else {
			System.out.println("�迭�� ũ�⺸�� Ů�ϴ�");
			return Integer.MIN_VALUE;
		}
	}
}
