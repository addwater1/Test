package practice2021_10_15;
import java.util.*;
public class InTriangle {

	public static void main(String[] args) {
		Scanner xScanner = new Scanner(System.in);
		Scanner yScanner = new Scanner(System.in);
		double x = xScanner.nextDouble();
		double y = yScanner.nextDouble();
		if(x+2*y<=200 && x>=0 && y>=0) {
			System.out.println("The point is in the triangle");
		}
		else {
			System.out.println("The point is not in the triangle");
		}
		// TODO Auto-generated method stub

	}

}
