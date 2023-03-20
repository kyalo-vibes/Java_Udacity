package javaUdacity;
import java.util.Random;
public class main {

	public static void main(String[] args) {
		Random rand = new Random();
        StringBuilder input = new StringBuilder();
        int length = rand.nextInt(20) + 1;
        for (int i = 0; i < length; i++) {
            char c = (char) (rand.nextInt(26) + 'a');
            input.append(c);
        }
        String vowels = getVowel.vowelOnly(input.toString());
        System.out.println("Input: " + input);
        System.out.println("Vowels: " + vowels);
        int mid = 8 + (1/2);
        System.out.println(mid);
	}

}
