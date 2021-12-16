package practice2021_10_15;
import java.util.*;
public class LoanTimetable {

	public static void main(String[] args) {
		int i;
		double interest;
		double balance;
		double principal;
		Scanner loanScanner = new Scanner(System.in);
		Scanner yeaScanner = new Scanner(System.in);
		Scanner rateScanner = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double loan = loanScanner.nextDouble();
		System.out.print("Number of years: ");
		double year = yeaScanner.nextDouble();
		System.out.print("Annual Interest Rate: ");
		double rate = rateScanner.nextDouble();
		double monthlyPayment = loan*(rate/1200)/(1-1/Math.pow(1+rate/1200, year*12));
		double totalPayment = monthlyPayment*12*year;
		System.out.printf("\nMonthly Payment: %.2f\n",monthlyPayment);
		System.out.printf("Total Payment: %.2f\n\n",totalPayment);
		System.out.println("Payment#    Interest    Principal    Balance");
		balance = loan;
		for(i=1; i<=year*12; i++) {
			interest = rate/1200*balance;
			principal = monthlyPayment-interest;
			balance = balance-principal;
			System.out.printf("%-8d",i);
			System.out.printf("%-8.2f",interest);
			System.out.printf("%-8.2f",principal);
			System.out.printf("%-8.2f\n",balance);
		}
		// TODO Auto-generated method stub

	}

}
