package practice2021_10_15;
import java.util.*;
public class TwoCircle {

	public static void main(String[] args) {
		Scanner x1InScanner = new Scanner(System.in);
		Scanner y1InScanner = new Scanner(System.in);
		Scanner r1InScanner = new Scanner(System.in);
		Scanner x2InScanner = new Scanner(System.in);
		Scanner y2InScanner = new Scanner(System.in);
		Scanner r2InScanner = new Scanner(System.in);
		String answer = new String();
		System.out.println("Enter circle1: ");
		double x1 = x1InScanner.nextDouble();
		double y1 = y1InScanner.nextDouble();
		double r1 = r1InScanner.nextDouble();
		System.out.println("Enter circle2: ");
		double x2 = x2InScanner.nextDouble();
		double y2 = y2InScanner.nextDouble();
		double r2 = r2InScanner.nextDouble();
		if((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2) <= (r1-r2)*(r1-r2)) {
			answer = "inside";
		}
		else if((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2) >= (r1+r2)*(r1+r2)) {
			answer = "not overlaps";
		}
		else {
			answer = "overlaps";
		}
		System.out.println("circle2 is " + answer + " circle1");
		// TODO Auto-generated method stub

	}

}
