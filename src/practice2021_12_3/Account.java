package practice2021_12_3;
import java.util.Date;
public class Account {
	private int id;
	private double balance;
	static private double annualInterestRate = 0;
	private Date dateCreated;
	public Account() {	
		this.id = 0;
		this.balance = 0;
		this.dateCreated = new Date();
	}
	public Account(int id,double balance){
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}
	public int getID() {
		return this.id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public static void setAnnualInterestRate(double a) {
		annualInterestRate = a;
	}
	public String getDateCreated() {
		return this.dateCreated.toString();
	}
	public static double getMonthlyInterestRate() {
		return annualInterestRate/1200;
	}
	public double getMonthlyInterest() {
		return this.balance * this.getMonthlyInterestRate();
	}
	public void withDraw(double x) {
		this.balance -= x;
	}
	public void deposit(double x) {
		this.balance +=x;
	}
}
