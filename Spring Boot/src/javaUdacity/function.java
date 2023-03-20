package javaUdacity;

public class function {
	public double makeChange(double itemCost, double dollarsProvided) {
		double change;
		change = dollarsProvided - itemCost;
		return change;
	}
	
	public static int rollDice() {
		double sides = Math.random() * 6;
		int value = (int) sides + 1;
		return value;
 	}
	
	public static int keepRolling() {
	    int dice1 = rollDice();
	    int dice2 = rollDice();
	    int dice3 = rollDice();
	    int dice4 = rollDice();
	    int dice5 = rollDice();
	    int count = 1;
	    while (!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)) {
	        //we need to re-roll
	        dice1 = rollDice();
	        dice2 = rollDice();
	        dice3 = rollDice();
	        dice4 = rollDice();
	        dice5 = rollDice();
	        count = count + 1;
	    }
	    System.out.println(dice1);
	    return count;
	}
	
	public static int countBlocks(int levels) {
		int total = 0;
		for(int i = 1; i <= levels; i++) {
			total = (int)(total + Math.pow((double)i, 2));
		}
		return total;
	}
	
	public static int addTwoNumbers(int a, int b) {
		return a + b;
	}
	
//	public int martingale() {
//		 int money = 1000;
//		 int target = 1200;
//		 int bet = 10;
//		 while (money > bet) {
//		  boolean win = play();
//		  if (win) {
//		   money += bet;
//		   bet = 10;
//		  } else {
//		   money -= bet;
//		   bet *= 2;
//		  }
//		 if (money >= target) {
//			 break;
//		 }
//		 }
//		 return money;
//		}
	
	public static String findLongestName(String [] names){
		int size = names.length;
		String longestName = names[0];
		for(int i = 1;i < size;i++) {
			if(names[i].length() > longestName.length()) {
				longestName = names[i];
			}
		}

	    return longestName;
	}
	
	public static void main(String[] args) {
		String[] input = {"Kyalo", "Maureen", "Teckler", "Abednego", "Dan"};
		System.out.println(keepRolling());
		System.out.println(countBlocks(3));
		System.out.println(addTwoNumbers(3, 4));
		System.out.println(findLongestName(input));
	}
}
