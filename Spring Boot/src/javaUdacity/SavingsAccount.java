package javaUdacity;

public class SavingsAccount extends BankAccount {
	private int transfers;
	
	SavingsAccount(String acctNumber, double balance, int transfers) {
		this.acctNumber = acctNumber;
		this.balance = balance;
		this.transfers = transfers;
	}
	
	public String getDetails() {
		this.acctNumber = acctNumber;
		this.balance = balance;
		String result = "AcctNumber = " + acctNumber + " and balance = " + balance; 
		return result;
	}
}
