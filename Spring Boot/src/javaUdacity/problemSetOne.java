package javaUdacity;

public class problemSetOne {

	public static void main(String[] args) {
		int bankBalance = 500;
		bankBalance = bankBalance + 250 - 100;
		System.out.println(bankBalance);
		System.out.println(2.0 * (5 / 2));
		
		int day = 17;
		String month = "March";
		System.out.println("My birthday is on the "+day+"th of "+month);
		
		String firstName = "Kevin";
		String lastName = "Kyalo";
		String fullName = firstName + " " + lastName;
		System.out.println("Hello, my name is "+fullName+".");
		int length = fullName.length() - 1;
		System.out.println("There are "+length+" letters in my name.");
		
		double farenheit = 68;
		double celsius = ((farenheit - 32) * 5) /9;
		System.out.println(celsius);
	}

}
