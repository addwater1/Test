package practice2021_10_15;
import java.util.*;
public class InCircle {

	public static void main(String[] args) {
		Scanner xScanner = new Scanner(System.in);
		Scanner yScanner = new Scanner(System.in);
		double x = xScanner.nextDouble();
		double y = yScanner.nextDouble();
		double d;
		d = x*x + y*y;
		if(d <= 100) {
			System.out.println("In the circle");
		}
		else {
			System.out.println("Out of the circle");
		}
		// TODO Auto-generated method stub

	}

}
