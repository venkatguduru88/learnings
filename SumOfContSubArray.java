package org.cap.demo.hackerrankexampl;

import java.util.Scanner;

public class SumOfContSubArray {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Number : ");
		Long number = sc.nextLong();
		
		int[] arr=  { 12,7,29,6, 2, 11,4,8};

		for (int k = 0; k < arr.length; k++) {
			int sum = 0;
			for (int j = k; j < arr.length; j++) {
				sum = sum + arr[j];
				if (sum == number) {
					for (int i = k; i <= j; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println();
				} else if (sum > number) {
					break;
				}

			}
		}
	}


}
