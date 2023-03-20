package javaUdacity;
import java.util.Scanner;
public class inputClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your living address below: ");
		Scanner sc = new Scanner(System.in);
		String address = sc.nextLine();
		System.out.println("You live at "+address);
		System.out.println("Enter your grade: ");
		int grade = sc.nextInt();
		if(grade > 90) {
			System.out.println("Amazing work!");
		} else {
			System.out.println("Not bad, you can do better next time.");
		}
	}

}
