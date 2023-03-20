package javaUdacity;

public class problemSetThree {

	public double absoluteValue(double a) {
		if(a < 0) {
			return -a;
		} else {
			return a;
		}
	}
	
	public double calculateTip(double mealCost) {
		return mealCost * 0.15;
	}
	
	public String nametagText(String name) {
		String nametag = "Hello, my name is "+name;
		return nametag;
	}
	
	/**
	* Converts from Fahrenheit to Celsius degrees.
	* @param fahrenheit Temperature in degrees Fahrenheit.
	* @return Equivalent temperature in degrees Celsius.
	*/
	public double fahrenheitToCelsius(double tempF) {
		double tempC = (tempF - 32) * 5/9;
		return tempC;
	}
	
	/**
	* Prints a temperature in both Fahrenheit and Celsius degrees.
	* @param fahrenheit Temperature in degrees Fahrenheit.
	*/
	public void printTemperature(double tempF) {
		double tempC = fahrenheitToCelsius(tempF);
		System.out.println("F: "+tempF);
		System.out.println("C: "+tempC);
	}
	
	public int generateRolls() {
		int randomRolls = (int) Math.random() * 7;
		return randomRolls;
	}
	
	public int monopolyRoll() {
		int rollA = generateRolls();
		int rollB = generateRolls();
		if(rollA != rollB) {
			return rollA + rollB;
		} else {
			int rollC = generateRolls();
			int rollD = generateRolls();
			return rollA + rollB + rollC + rollD;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
