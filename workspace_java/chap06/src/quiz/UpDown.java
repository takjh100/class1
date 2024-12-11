package quiz;

import java.util.Random;
import java.util.Scanner;

public class UpDown {

	
	/*
	 * up/down
	 *
	 * 생성시에 임의의 숫자 정하기 (1~10) 
	 * 정답시도시 감이 오는 숫자 넣기 
	 * 결과 :정답,up,down 
	 * 정답 맞출때 까지,또는 기회 5회 안에
	 * 맞추기 몰래 정답 보기 (힌트기능)
	 * 
	 */
	
	
	//임의의 숫자를 정하는 랜덤기능을 (1~10)제한되게
	//작다 크다를 통해 랜덤숫자에 대하여 결과값이 :정답,up,down나오게
    //정답을 맞출때 까지 돌아가도록 while ,bleak사용
	//기회는 5번 반복문제한?
	//정답 몰래보기 (힌트)
	
	int ran = 0; 
	Random random = new Random();
	void gameStart () {
		System.out.println("up,down 게임을 시작합니다");
		ran = random.nextInt(10)+1;
		game();
	}
	
	
	


//	void game() {
//		Scanner scanner = new Scanner(System.in);
//		int sean = scanner.nextInt();
//			if (sean == ran) {
//				System.out.println(sean+"정답");
//			} else if (sean < ran) {
//				System.out.println("up");
//			} else if (sean > ran) {
//				System.out.println("down");
//			} else {
//				System.out.println("제대로 입력해 주세요");
//			}System.out.println("게임종료");
//		}		
	
	void game() {
		Scanner scanner = new Scanner(System.in);
		int sean = 0;
		for (int i = 0; i < 5; i++) {
			sean = scanner.nextInt();
			if (sean == ran) {
				System.out.println(sean + "정답");
			} else if (sean < ran) {
				System.out.println("up");

			} else if (sean > ran) {
				System.out.println("down");

			} else {
				System.out.println("제대로 입력해 주세요");
			}

		}
		System.out.println("게임종료");

	}

	void hint() {
		System.out.println(ran);
	}

//switch (sean) {
//case 1:
//	System.out.println("정답");
//	break;
//}
}
