package practice2021_12_3;

import java.util.ArrayList;
import java.util.Date;

public class Account2 extends Account{
	private String name;
	public Account2(int id,double balance,String name) {
		super(id,balance);
		this.name = name;
	}
	class Transaction{
		Date date;
		char type;
		double amount;
		double balance;
		String description;
		Transaction(char a,double b,double c,String d) {
			this.type = a;
			this.amount = b;
			this.balance = c;
			this.description = d;
			this.date = new Date();
		}
	}
	ArrayList<Transaction> transactions = new ArrayList<>();
	public void withDraw(char a,double b,double c,String d) {
		Transaction p = new Transaction(a, b, c, d);
		transactions.add(p);
	}
	public void deposit(char a,double b,double c,String d) {
		Transaction p = new Transaction(a, b, c, d);
		transactions.add(p);
	}
	public void printAccount() {
		for(int i = 0;i<transactions.size();i++) {
			System.out.println(transactions.get(i).type+transactions.get(i).amount+
				transactions.get(i).balance+transactions.get(i).description);
		}
	}
}
