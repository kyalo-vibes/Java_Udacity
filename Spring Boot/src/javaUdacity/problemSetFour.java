package javaUdacity;

public class problemSetFour {
	
	public int factorial(int n) {
		int answer = 1;
		for(int i=1;i<=n; i++) {
			answer *= i;
		}
		return answer;
	}
	
	public int indexOfFirstOccurrence(String[] stringArray, String target)
	{
		int size = stringArray.length;
		for(int i=0; i < size;i++) {
			if(stringArray[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
	
	public int yearsTilOneMillion(double initialBalance) {
		double deposit = initialBalance;
		int year = 0;
		while (!(deposit>=1000000)) {
			deposit *= 1.05;
			year++;
		}
		return year;
		}
	
	public void printInReverse(String[] stringArray) {
		int size = stringArray.length;
		for (int i = size-1;i>=0; i--) {
			System.out.println(stringArray[i]);
		}
	}
	
	public int findRange(int[] intArray) {
		int size = intArray.length;
		int min = intArray[0], max = intArray[0];
		for(int i=1; i<size; i++) {
			if(intArray[i]<min) {
				min = intArray[i];
			} else if(intArray[i]>max) {
				max = intArray[i];
			}
		}
		if(size==0) {
			return -1;
			}
		else {
			return max-min;
		}
		}

	public int generateRolls() {
		double randomRolls = Math.random() * 6;
		randomRolls += 1;
		return (int) randomRolls;
	}
	
	public int monopolyRoll() {
		int rollA = generateRolls();
		int rollB = generateRolls();
		System.out.println(rollA);
		System.out.println(rollB);
		int numOfRolls = 1;
		int total;
		total = rollA + rollB;
		while(rollA == rollB) {
			rollA = generateRolls();
			rollB = generateRolls();
			System.out.println(rollA);
			System.out.println(rollB);
			numOfRolls++;
			total += rollA + rollB;
			if(numOfRolls == 3) {
				return -1;
			}
		}
		return total;
	}
	
	public int recursiveMonopoly() {
		int rollA = generateRolls();
		int rollB = generateRolls();
		System.out.println(rollA);
		System.out.println(rollB);
		if(rollA != rollB) {
			return rollA + rollB;
		} else {
			return rollA + rollB + recursiveMonopoly();
		}
	}
	
	public static void main(String[] args) {
		problemSetFour obj = new problemSetFour();
		System.out.println(obj.factorial(5));
		String[] sentence = {"Learning", "Java", "is", "fun."};
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		int indexOfWordJava = obj.indexOfFirstOccurrence(sentence, "Javal");
		System.out.println(indexOfWordJava);
		System.out.println(obj.yearsTilOneMillion(500000.00));
		obj.printInReverse(days);
		int[] rangeInput = {1, 0, 2, 3, -1, 2};
		System.out.println(obj.findRange(rangeInput));
		System.out.println(obj.monopolyRoll());
		System.out.println("Reached here.");
		System.out.println(obj.recursiveMonopoly());
	}

}
