package javaUdacity;

import java.util.Date;

public class COD extends BankAccount {
	Date expiry;
	
	COD(String acctNumber, double balance, Date expiry) {
		this.acctNumber = acctNumber;
		this.balance = balance;
		this.expiry = expiry;
	}
	
	public String getDetails() {
		this.acctNumber = acctNumber;
		this.balance = balance;
		String result = "AcctNumber = " + acctNumber + " and balance = " + balance; 
		return result;
	}
}
