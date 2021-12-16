package practice2021_10_15;
import java.util.*;
public class TwoRectangle {

	public static void main(String[] args) {
		Scanner x1InScanner = new Scanner(System.in);
		Scanner y1InScanner = new Scanner(System.in);
		Scanner w1InScanner = new Scanner(System.in);
		Scanner h1InScanner = new Scanner(System.in);
		Scanner x2InScanner = new Scanner(System.in);
		Scanner y2InScanner = new Scanner(System.in);
		Scanner w2InScanner = new Scanner(System.in);
		Scanner h2InScanner = new Scanner(System.in);
		String answer = new String();
		System.out.println("Enter r1: ");
		double x1 = x1InScanner.nextDouble();
		double y1 = y1InScanner.nextDouble();
		double w1 = w1InScanner.nextDouble();
		double h1 = h1InScanner.nextDouble();
		System.out.println("Enter r2: ");
		double x2 = x2InScanner.nextDouble();
		double y2 = y2InScanner.nextDouble();
		double w2 = w2InScanner.nextDouble();
		double h2 = h2InScanner.nextDouble();
		if(Math.abs(x1-x2)<=(w1-w2)/2.0 && Math.abs(y1-y2)<=(h1-h2)/2.0) {
			answer = "inside";
		}
		else if(Math.abs(x1-x2)>=(w1+w2)/2.0 && Math.abs(y1-y2)>=(h1+h2)/2.0) {
			answer = "not overlaps";
		}
		else {
			answer = "overlaps";
		}
		System.out.println("r2 is " + answer + " r1");
		// TODO Auto-generated method stub

	}

}
