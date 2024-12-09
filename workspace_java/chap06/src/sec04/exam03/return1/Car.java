package sec04.exam03.return1;

public class Car {

	int gas = 5;
	// 필드
	// 같은말로 멤버변수
	// 클래스를 생성(new)하는 순간과 함께 생성됨
	// 클래스 소멸(가베지 컬렉터 동작) 시 까지 생존
	// 그 동안 메모리를 차지하면서 계속 저장된 값이 유지
	// 가능하면 지역변수로 먼저 해결하는게 좋음
	// 클래스 자체에 값을 저장하거나
	// 메소드 끼리 공유하는 목적으로 사용하거나

	int speed;
	// 값을 선언하지 않은 경우
	// 0, false, null로 초기화된다
	
	void setGas(int gas) {
		this.gas = gas;
	}

	void satSpeed(int s) {
		speed = s;
		System.out.println("속도를 "+speed+"로 바꿉니다");
	}
	
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("주행중..잔량 : " + gas);
				satSpeed(gas);
				gas--;
			} else {
				System.out.println("주행중..잔량 : " + gas);
				return;
			}
		}
	}
}