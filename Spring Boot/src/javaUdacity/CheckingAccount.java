package javaUdacity;

public class CheckingAccount extends BankAccount {
	private double limit;
	
	CheckingAccount(String acctNumber, double balance, double limit) {
		this.acctNumber = acctNumber;
		this.balance = balance;
		this.limit = limit;
	}
	
	public String getDetails() {
//		this.acctNumber = acctNumber;
//		this.balance = balance;
		String result = "AcctNumber = " + this.acctNumber + " and balance = " + this.balance; 
		return result;
	}
}
