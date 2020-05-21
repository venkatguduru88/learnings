package org.cap.demo.hackerrankexampl;

import java.util.Scanner;

public class StrongNumber {

	public static int fact(int number) {
		int fact =1;
		  for(int i=1;i<=number;i++){    
		      fact=fact*i;    
		  }
		  return fact;
	}
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int number = sc.nextInt();
		int sum = 0;
		if (number == 0) {
			System.out.println(1);
		} else {
			while (number >= 0) {
				int n = number % 10;
				number = number / 10;
				if (n > 0) {
					sum = sum + fact(n);
				} else
					break;

			}
			System.out.println(sum);
		}
	}

}
