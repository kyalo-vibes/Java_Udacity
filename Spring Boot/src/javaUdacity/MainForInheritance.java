package javaUdacity;

public class MainForInheritance {

	public static void main(String[] args) {
		CheckingAccount checking = new CheckingAccount("CT001", 250, 100000);
//		SavingsAccount saving = new SavingsAccount();
//		COD cod = new COD();
		System.out.println(checking.getDetails());
		}

}
