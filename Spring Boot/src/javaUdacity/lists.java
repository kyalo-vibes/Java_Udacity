package javaUdacity;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class lists {
	
	public static List<String>[] groupStrings(List<String> input) {
	    @SuppressWarnings("unchecked")
	    List<String>[] output = new List[3];
	    output[0] = new ArrayList<>();
	    output[1] = new ArrayList<>();
	    output[2] = new ArrayList<>();
	    for (String str : input) {
	        char c = str.charAt(0);
	        if (c == 'a') {
	            output[0].add(str);
	        } else if (c == 'b') {
	            output[1].add(str);
	        } else {
	            output[2].add(str);
	        }
	    }
	    return output;
	}


	public static void main(String[] args) {
		List<String> input = Arrays.asList("abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb", "eeee");
        for (List<String> lst : groupStrings(input)) {
            System.out.println(lst);
            System.out.println();
        }
	}

}
