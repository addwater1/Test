package practice2021_11_12;

import java.util.GregorianCalendar;

public class TestCalendar {

	public static void main(String[] args) {
		GregorianCalendar cld = new GregorianCalendar();
		System.out.println(cld.get(GregorianCalendar.YEAR));
		System.out.println(cld.get(GregorianCalendar.MONTH));
		System.out.println(cld.get(GregorianCalendar.DAY_OF_MONTH));
		cld.setTimeInMillis(1234567898765L);
		System.out.println(cld.get(GregorianCalendar.YEAR));
		System.out.println(cld.get(GregorianCalendar.MONTH));
		System.out.println(cld.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
