package sec03.exam02;

public abstract class Windows {

	abstract void start();
	
	void boot() {
		System.out.println("CMOS ����");
		System.out.println("������ ����");
		start(); 
		System.out.println("������ ���� ���� Ŀ���� �ε�����...");
	}
}
