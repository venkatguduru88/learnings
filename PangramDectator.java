package org.cap.demo.hackerrankexampl;

import java.util.ArrayList;
import java.util.List;

public class PangramDectator {
	public static void main(String[] args) {
		// String str = "The quick brown fox jumps over the lazy dog".toLowerCase();
		String str = "findMissingLetters".toLowerCase();
		boolean[] alphaList = new boolean[26];
		
		int index = 0;
		int flag = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				index = str.charAt(i) - 'a';
			}
			alphaList[index] = true;
		}
		List<Character> charList = new ArrayList<>();
		for (int i = 0; i <= 25; i++) {
			if (alphaList[i] == false) {
				charList.add((char) ('a' + i));
				flag = 0;
			}

		}

		System.out.print("String: " + str);
		if (flag == 1)
			System.out.print("\nThe above string is a pangram.");
		else {
			System.out.print("\nThe above string is not a pangram.");
			System.out.println("Missing letters in word are :");
			System.out.println(charList);
		}
	}
}