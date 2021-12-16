package practice2021_12_3;
public class TestAccount {
	public static void main(String[] args) {
		Account myAccount = new Account(1122,20000);
		myAccount.withDraw(2500);
		myAccount.deposit(3000);
		myAccount.setAnnualInterestRate(4.5);
		System.out.println(myAccount.getBalance());
		System.out.println(myAccount.getMonthlyInterest());
		System.out.println(myAccount.getDateCreated());
	}
}
