package org.cap.demo.hackerrankexampl;

import java.util.Scanner;

public class ConsecutiveSum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Number : ");
		Long number = sc.nextLong();
		int end = (int) ((number + 1) / 2);

		for (int k = 1; k < end; k++) {
			int sum = 0;
			for (int j = k; j <= end; j++) {
				sum = sum + j;
				if (sum == number) {
					for (int i = k; i <= j; i++) {
						System.out.print(i + " ");
					}
					System.out.println();
				} else if (sum > number) {
					break;
				}

			}
		}
	}

}
