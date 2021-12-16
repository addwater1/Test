package practice2021_10_15;
import java.util.*;
public class CalculatePayment {

	public static void main(String[] args) {
		Scanner loanScanner = new Scanner(System.in);
		Scanner yeaScanner = new Scanner(System.in);
		double rate;
		System.out.print("Loan Amount: ");
		double loan = loanScanner.nextDouble();
		System.out.print("Number of years: ");
		double year = yeaScanner.nextDouble();
		System.out.println("Interest Rate    Monthly Payment    TotalPayment");
		for(rate = 5; rate<=8; rate+=0.125) {
			double monthlyPayment = loan*(rate/1200)/(1-1/Math.pow(1+rate/1200, year*12));
			double totalPayment = monthlyPayment*12*year;
			System.out.printf("%%");
			System.out.printf("%-17.3f",rate);
			System.out.printf("%-19.2f",monthlyPayment);
			System.out.printf("%-10.2f\n",totalPayment);
		}
		// TODO Auto-generated method stub

	}

}
