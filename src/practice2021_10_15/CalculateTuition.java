package practice2021_10_15;

import java.util.Iterator;

public class CalculateTuition {

	public static void main(String[] args) {
		double amount = 10000;
		double val = amount;
		double total = 0;
		int i;
		for(i=0; i<10; i++) {
			val = val*1.05;
		}
		amount = val;
		for(i=0; i<4; i++) {
			total = total + val;
			val = val*1.05;
		}
		System.out.println(amount + " , " + total);
		// TODO Auto-generated method stub

	}

}
