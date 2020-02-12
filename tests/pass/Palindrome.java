package pass;

import java.lang.System;

public class Palindrome {
	public String palindrome (String s) {
		String s2 = s.toLowerCase(); // Lower case
		int i = 0;
		int j = s2.length() - 1;
		while (j > i) {
			//while (s2.charAt(i) == ' ') i = i + 1;
			//while (s2.charAt(j) == ' ') j = j - 1;
			if (s2.charAt(i) == s2.charAt(j)) {
			}
			else {
				return "";
			}
			i = i + 1;
			j = j - 1;
		}
		return s;
	}
}
 