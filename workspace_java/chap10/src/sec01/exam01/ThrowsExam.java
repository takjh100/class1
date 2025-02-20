package sec01.exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsExam {

	public static void main(String[] args) {

		try {
			test();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			test2();
		} catch (HumanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		FileInputStream fis = null;
//		fis = new FileInputStream("c; text.txt");
		
	}

	static void test() throws ClassNotFoundException, IOException {
		Class.forName("asdfasf");
	}

	static void test2() throws HumanException, IOException {
		System.out.println(1);
		int a = 10;
		if (a < 100) {
			throw new HumanException("123");
		} else {
			throw new IOException("456");
		}
	}
}
