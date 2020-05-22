package org.cap.demo.coderpad;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AllCombForGivenNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		Integer number = sc.nextInt();
		Set<String> combSet = new TreeSet<>();
		for (int i = 1; i <= number/2; i++) {

			for (int j = 1; j < number; j++) {
				StringBuilder builder = new StringBuilder();
				int sum = i;
				builder.append(i + " ");
				while (sum <= number) {
					sum = sum + j;
					builder.append(j + " ");
					if (sum == number) {
						combSet.add(builder.toString().trim());
						combSet.add(builder.reverse().toString().trim());
						
					}
					else if (sum > number) {
						break;
					}
				}

			}

		}
		combSet.forEach(System.out::println);

	}

}
