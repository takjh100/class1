package sec06.exam06_getset;

public class Car {

	private int speed;
	private boolean stop;
	
	
	//�̷��� ������� ���� �Ǵµ�
	public int test() {
		return speed;
	}
	
	// getter�� ���� �ʵ� ���� �����ϴ� ���
	// �޼ҵ�� : get + �ʵ��(ù���ڸ� �빮��)
	// �������� : ����
	// ����Ÿ�� : �ʵ��� Ÿ��
	public int getSpeed() {
		return this.speed;
	}
	
	// setter�� ���� �ʵ� ���� �����ϴ� ���
	// �޼ҵ�� : set + �ʵ��(ù���ڸ� �빮��)
	// �������� : �ʵ��� Ÿ������ �� �����ϳ�
	// ����Ÿ�� : ����
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//getter �߿��� boolean Ÿ���� ���
	//get + �ʵ�� ��ſ� is + �ʵ�� �����ϴ�
	//�׷��� ������ �߻��ϰų� �ν� ���ϴ� (���� ����)Ŭ������
	//���� ���� �־ �׳� 
	private boolean isStop() {
	}
}
