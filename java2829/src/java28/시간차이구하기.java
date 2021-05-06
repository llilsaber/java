package java28;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class 시간차이구하기 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss", Locale.KOREA);
		Date d1 = f.parse("15:05:10");
		Date d2 = f.parse("16:05:10");
		long diff = d2.getTime() - d1.getTime();
		long sec = diff / 1000 / 60 / 60;
		System.out.println(sec);
	}
}