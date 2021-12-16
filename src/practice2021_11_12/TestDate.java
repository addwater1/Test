package practice2021_11_12;

import java.util.Date;

import javax.xml.crypto.Data;

public class TestDate {

	public static void main(String[] args) {
		Date d = new Date();
		d.setTime(10000);
		System.out.println(d.toString());
		d.setTime(100000);
		System.out.println(d.toString());
		d.setTime(1000000);
		System.out.println(d.toString());
		d.setTime(10000000);
		System.out.println(d.toString());
		d.setTime(100000000);
		System.out.println(d.toString());
		d.setTime(1000000000);
		System.out.println(d.toString());
		d.setTime(10000000000L);
		System.out.println(d.toString());
		d.setTime(100000000000L);
		System.out.println(d.toString());
	}

}
