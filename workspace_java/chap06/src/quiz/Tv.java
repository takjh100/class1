package quiz;

import java.util.Random;
import java.util.Scanner;



public class Tv {

	// 전원기능
	// 볼륨up/down (0~10)
	// 채널up/down/직접입력
	// 현재 정보 보기

	// 전원 on/off 메소드안에서 나누어 if문을 통해 만들기
	// 볼륨 up 을 눌렀을땐 + /down 을 눌렀을땐 - 로 0~10제한을 두도록
	// 채널 up 을 눌렀을땐 + /down 을 눌렀을땐 - 로 제한이 없도록
	String pw;
	String powwerOn;
	String powwerOff;
	int vol;
	int cn;

	Tv() {
	}

//	void power(int x) {
//		if(x == 1) {
//			pw = "on";
//			System.out.println("전원on");
//		}else if (x == 2) {
//			pw = "off";
//			System.out.println("전원off");
//		}else {
//			System.out.println("제대로 입력해주세요");
//		}
//	}
	void powerOn() {
		System.out.println("전원을 켭니다");
		pw = "켜짐";
	}

	void powerOff() {
		System.out.println("전원을 끕니다");
		pw = "꺼짐";
	}

//	void volume(int x) {
//		if(x == 1 && vol >= 0 && vol <= 10) {
//			vol++;
//			System.out.println("volume을 높입니다");
//		}else if (x == 2 && vol >= 0 && vol <= 10) {
//			vol--;
//			System.out.println("volume을 내립니다");
//		}else {
//			System.out.println("제대로 입력해주세요");
//		}
//	}	
	void volUp() {
		if (vol >= 0 && vol < 10) {
			vol++;
			System.out.println("volume을 높입니다");
			System.out.println("volume은" + vol + "입니다");
		} else if (vol == 10) {
			System.out.println("최대volume은 10 입니다");
		} else if (vol > 10) {
			System.out.println("volume 10 입니다");
		}

	}

	void volDown() {
		if (vol > 0 && vol < 10) {
			vol--;
			System.out.println("volume을 내립니다");
			System.out.println("volume은" + vol + "입니다");
		} else if (vol == 0) {
			System.out.println("최소volume은 0 입니다");
		} else if (vol < 0) {
			System.out.println("volume 0 입니다");
		}
	}
//	void channel(int x, int y) {
//		if(x == 1 && cn >= 0) {
//			cn++;
//			System.out.println("channel을 올립니다");
//		}else if (x == 1 && cn > 0) {
//			cn--;
//			System.out.println("channel을 내립니다");
//		}else if (x == 1) {
//			cn = y;
//			System.out.println("channel을 "+y+"번 으로 바꿉니다");
//		}else {
//			System.out.println("제대로 입력해주세요");
//		}
//	}

	void cn(int x) {
		if (x >= 0 && x <= 999) {
			cn = x;
			System.out.println("channel을 " + cn + "번 으로 바꿉니다");
		} else if (cn > 999) {
			System.out.println("channel은 999번 입니다");
		} else if (cn < 0) {
			System.out.println("channel은 0번 입니다");
		} else {
			System.out.println("제대로 입력해 주세요");
		}
	}

	void cnUp() {
		if (cn >= 0 && cn <= 999) {
			cn++;
			System.out.println("channel을 올립니다");
			System.out.println("channel은 " + cn + "번 입니다");
		} else if (cn > 999) {
			System.out.println("channel은 999번 입니다");
		} else {
			System.out.println("제대로 입력해 주세요");
		}
	}

	void cnDown() {
		if (cn > 0 && cn <= 999) {
			cn--;
			System.out.println("channel을 내립니다");
			System.out.println("channel은 " + cn + "번 입니다");
		} else if (cn < 0) {
			System.out.println("channel은 0번 입니다");
		} else {
			System.out.println("제대로 입력해 주세요");
		}
	}

	void display() {
		System.out.println("전원 :" + pw);
		System.out.println("volume :" + vol);
		System.out.println("channel :" + cn);

	}

//	/*
//	 * up/down
//	 *
//	 * 생성시에 임의의 숫자 정하기 (1~10) 
//	 * 정답시도시 감이 오는 숫자 넣기 
//	 * 결과 :정답,up,down 
//	 * 정답 맞출때 까지,또는 기회 5회 안에
//	 * 맞추기 몰래 정답 보기 (힌트기능)
//	 * 
//	 */
//	
//	
//	//임의의 숫자를 정하는 랜덤기능을 (1~10)제한되게
//	//작다 크다를 통해 랜덤숫자에 대하여 결과값이 :정답,up,down나오게
//    //정답을 맞출때 까지 돌아가도록 while ,bleak사용
//	//기회는 5번 반복문제한?
//	//정답 몰래보기 (힌트)
//	
//	int ran = 0; 
//	Random random = new Random();
//	void gameStart () {
//		ran = random.nextInt(10)+1;
//		game();
//	}
//	
//	
//	
//
//
//	void game() {
//		Scanner scanner = new Scanner(System.in);
//		int sean = scanner.nextInt();
//		while (true) {
//			if (sean == ran) {
//				System.out.println(sean+"정답");
//				break;
//			} else if (sean < ran) {
//				System.out.println("up");
//			} else if (sean > ran) {
//				System.out.println("down");
//			} else {
//				System.out.println("제대로 입력해 주세요");
//			}
//		}System.out.println("게임종료");
//	}
//
//	void hint() {
//		System.out.println(ran);
//	}
//	
////switch (sean) {
////case 1:
////	System.out.println("정답");
////	break;
////}
}