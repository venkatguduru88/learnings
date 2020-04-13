package org.cap.demo.hackerrankexampl;

import java.util.Scanner;

public class ShortestSubString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String : ");
		String str = sc.next();
		char[] array = str.toCharArray();
		StringBuilder substring = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			if (!substring.toString().contains(Character.toString(array[i])))
				substring = substring.append(Character.toString(array[i]));
		}

		System.out.println("Substring : " + substring);
	}

}
