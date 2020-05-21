package org.cap.demo.hackerrankexampl;

import java.util.Scanner;

public class WeightOfString {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		String str = sc.next();
		str=str.toLowerCase();
		int weight =0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				weight = weight + str.charAt(i)+1 - 'a';
				System.out.println(str.charAt(i) +" ::"+(str.charAt(i)+1 - 'a'));
				
			}

		}
		System.out.println(weight);
	}

}
