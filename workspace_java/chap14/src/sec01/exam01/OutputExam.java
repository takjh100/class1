package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.spec.DSAGenParameterSpec;

import javax.sql.DataSource;

public class OutputExam {

	public static void main(String[] args) {

		String path = "c:\\temp";
		String fileName = "test.txt";
		
//		OutputStream os2 = new FileOutputStream(path+"\\"+fileName);
		OutputStream os = null;
		try {
			os = new FileOutputStream(path+System.getProperty("file.separator")+fileName);
		
		    String data = "abc\n�ѱ�\n123";
		    byte[] datas = data.getBytes();
		    
		    //����
		    os.write(datas,0,datas.length);
		    os.flush();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(os != null) {
				try {
					os.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}
		//try-with-resources 
		try(
			OutputStream os3 = new FileOutputStream(path+"\\"+fileName);
    	){
			String data = "abc\n�ѱ�\n12334213123";
		    byte[] datas = data.getBytes();
		    
		    //����
		    os3.write(datas,0,datas.length);
		    os3.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
