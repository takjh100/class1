package sec01.exam02;

import java.lang.invoke.StringConcatFactory;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExam {

	public static void main(String[] args) {

		long now = System.currentTimeMillis();
		System.out.println(now);
		
		for(int i=0; i<1000; i++) {
//			System.out.println(i);
		}
		
		long after = System.currentTimeMillis() - now;
		System.out.println(after);
		
		Date date = new Date();
		System.out.println(date);
		
		String format = "yyyy³â MM¿ù ddÀÏ HH:mm:ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat (format);
		String formatDate = sdf.format(date);
		System.out.println(formatDate);

	}

}
