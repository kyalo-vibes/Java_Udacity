package javaUdacity;

public class problemSetTwo {

	public static void main(String[] args) {
		boolean canSeePlayer = true;
		boolean playerPoweredUp = false;
		
		if(canSeePlayer) {
			if(playerPoweredUp) {
				System.out.println("Run away!");
			} else {
				System.out.println("Attack!");
			}
		}
		else {
			System.out.println("Wander.");
		}
		
		//Assume these can have any value:
		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 60.0;
		//TODO: print "Let’s stay home." if its raining, snowing or
		//below 50 degrees and print "Let’s go out!" otherwise.
		if(isRaining || isSnowing || temperature<50) {
			System.out.println("Let's stay home.");
		} else {
			System.out.println("Let's go out!");
		}
		
		//Assume this could have any value between 0 and 24:
		int time = 18;
		String timeOfDay;
		//TODO: set timeOfDay to the correct String value.
		if(time >= 5 && time < 12) {
			timeOfDay = "morning";
		}
		else if(time >= 12 && time < 20) {
			timeOfDay = "daytime";
		} else {
			timeOfDay = "night";
		}
		System.out.println(timeOfDay);
		
		//Assume these could have any value:
		int weekday = 5;
		boolean holiday = false;
		
		if(weekday > 5 || holiday) {
			System.out.println("Sleep in");
		} else {
			System.out.println("Wake up at 7.00");
		}
		
		//Assume this can have any value from 1 to 7:
		int dayOfWeek = 1;
		//TODO: declare a String variable called schedule.
		//TODO: write a switch statement that give schedule a different
		//value for each day of the week based on the dayOfWeek variable.
		//Don’t forget to "break" after each case, and don’t forget to
		//provide a default case!
		String schedule;
		switch(dayOfWeek) {
		case 1: schedule = "Gym in the morning.";
			break;
		case 2: schedule = "Class after work.";
			break;
		case 3: schedule = "Meetings all day.";
			break;
		case 4: schedule = "Work from home.";
			break;
		case 5: schedule = "Game night after work.";
			break;
		default: schedule = "Free.";
			break;
		}
		System.out.println(schedule);
	}
	
}
