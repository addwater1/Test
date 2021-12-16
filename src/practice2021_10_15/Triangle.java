package practice2021_10_15;
import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		Scanner xScanner = new Scanner(System.in);
		Scanner yScanner = new Scanner(System.in);
		Scanner zScanner = new Scanner(System.in);
		System.out.println("Enter edge of the triangle: ");
		double x = xScanner.nextDouble();
		double y = yScanner.nextDouble();
		double z = zScanner.nextDouble();
		if(x+y>z && x+z>y && y+z>x) {
			System.out.println("Value = " + (x+y+z));
		}
		else {
			System.out.println("Illegal input");
		}
		// TODO Auto-generated method stub

	}

}
