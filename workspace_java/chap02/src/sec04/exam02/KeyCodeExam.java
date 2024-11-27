package sec04.exam02;

import java.io.IOException;
import java.util.Scanner;

public class KeyCodeExam {

	public static void main(String[] args) {

		int keyCode;
		
//		try {
//			keyCode = System.in.read();
//			System.out.println(keyCode);
//			
//			keyCode = System.in.read();
//			System.out.println(keyCode);
//			
////		ctrl + f11 으로 실행 후 콘솔에 키보드입력시 숫자확인가능	
//			
//			
////		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		Scanner scan = new Scanner(System.in);
		String inputData = scan.nextLine();
		System.out.println("inputData : "+ inputData);
		
		
	}

}
