package practice2021_10_15;
import java.util.*;
public class StatisticsCalculation {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int i;
		double x;
		double sum1 = 0;
		double sum2 = 0;
		for(i=1; i<=10; i++) {
			x = inScanner.nextDouble();
			sum1 += x;
			sum2 += x*x;
		}
		double mean = sum1 / 10;
		double standardDeviation = Math.sqrt((sum2-sum1*sum1/10)/9);
		System.out.printf("The mean is %.2f\n",mean);
		System.out.printf("The standard deviation is %.5f",standardDeviation);
		
		
		// TODO Auto-generated method stub

	}

}
