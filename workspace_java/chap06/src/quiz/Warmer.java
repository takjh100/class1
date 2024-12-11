package quiz;

public class Warmer {

	// 전원 켜기
	// 전원 끄기
	// 저온 발열 기능(전원이 켜져있을때만)
	// 고온 발열 기능(전원이 켜져있을때만)
	// 발열중지
	// 상태 표시 기능 (전원 상태와 발열 상태 출력)
	Warmer(){
		
	}
	String power;
	String wind;
	String stop;

//	void everyone(int x) {
//		if (x == 1) {
//			this.power = "on";
//			System.out.println("전원켜짐");
//		} else if (x == 2) {
//			this.power = "off";
//			System.out.println("전원꺼짐");
//		}else {
//			System.out.println("제대로 입력해주세요");
//		}
//	}
//
//	void system(int x) {
//	    if(this.power.equals("off")) {
//	    	this.wind ="전원이 꺼져있습니다";
//		System.out.println("전원이 꺼져있습니다");
//	    }else if (this.power.equals("on")  && x == 1) {
//			this.wind = "저온작동";
//			System.out.println("저온작동");
//		} else if (this.power.equals("on") && x == 2) {
//			this.wind = "고온작동";
//			System.out.println("고온작동");
//		} else if (this.power.equals("on") && x == 3) {
//			this.wind = "발열중지";
//			System.out.println("발열중지");
//		}else {
//		System.out.println("제대로 입력해주세요");
//      }
//	}
//	void mark() {
//		System.out.println("현 상태 :"+this.power);
//		System.out.println("현 상태 :"+this.wind);
//
//	}


	String onoff;
	String wind2;

	void display() {
		System.out.println("현재 "+onoff+" 상태");

	}

	// 전원 켜기 기능
	void powerOn() {
		System.out.println(" 전원을 켭니다");
		this.onoff = "켜기";
	}

	// 전원 끄기 기능
	void powerOff() {
		System.out.println(" 전원을 끕니다");
		this.onoff = "끄기";
	}

	void low() {
		if (onoff.equals("켜기")) {
			System.out.println("저온 작동");
			this.wind2 = "저온";
		} else if (onoff.equals("끄기")) {
			System.out.println("전원을 꺼져있습니다");
		}
	}

	void high() {
		if (onoff.equals("켜기")) {
			System.out.println("고온 작동");
			this.wind2 = "고온";
		} else if (onoff.equals("끄기")) {
			System.out.println("전원을 꺼져있습니다");
		}
	}

	void stop() {
		if (onoff.equals("켜기")) {
			System.out.println("발열중지");
			this.wind2 = "발열중지";
		} else if (onoff.equals("끄기")) {
			System.out.println("전원을 꺼져있습니다");
		}
	}
}
