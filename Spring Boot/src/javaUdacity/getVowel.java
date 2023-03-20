package javaUdacity;

public class getVowel {
	public static String vowelOnly(String input) {
		StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.indexOf(c) != -1) {
                result.append(c);
            }
        }
        return result.toString();
	}
}

