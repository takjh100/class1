package sec02.exam01;

public class Driver{

	void runCoupe(Coupe coupe) {
		System.out.println("���丸 ���ϴ� �մ�");
		coupe.drive();
	}
	
	
	void run(Car car) {
		System.out.println("run �ڽ��ϴ� �մ�");
		car.drive();
		
		// ���� : �θ� ��� ����
		// ������ : �ڽ� Ŭ����
		if(car instanceof Landrover) {
			System.out.println("�̰� ����ι��׿�!!");
			Landrover landrover = (Landrover)car;
			landrover.autoRun();
		}
	}
}
