package sec01.exam03_override;

public class Computer extends Calc {

	@Override // �θ� �ش� �޼ҵ尡 �Ȱ��� �ִ��� �˻�����
	int plus(int a, int b) {
//		int reuslt = a + b;
		int reuslt = super.plus(a, b);
		System.out.println("�����Ͻ� ������ ");
		System.out.println(reuslt + "�Դϴ�");
		return reuslt;
	}
	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer�� areaCircle ����");
		return Math.PI *r *r;
	}
}
