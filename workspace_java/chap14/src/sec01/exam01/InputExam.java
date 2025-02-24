package sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;

public class InputExam {

	public static void main(String[] args) {

		String path = "c:\\temp\\test.txt";
		
		try(
		    InputStream is = new FileInputStream(path);		
		){
			//�۴��� �ٰ��� ����
//			int BUFFER_SIZE = 1024 * 8; // = 8Ű�ι���Ʈ
			int BUFFER_SIZE = 10;
			byte[] datas = new byte[BUFFER_SIZE];
			
			int result = 0;    // ���� ��
			String data ="";   // ���� ���� byre�� ����
			
//			result = is.read(datas);
//			data += new String(datas, 0, result);
//			while(result != -1) {
//				result = is.read(datas);
//				
//				if( result != -1) {
//					data += new String(datas, 0, result);
//				}
//			}
			
			while( (result = is.read(datas)) != -1 ) {
				data += new String(datas, 0, result);
//				System.out.println(data);
			}
			
			System.out.println("data : " + data);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
