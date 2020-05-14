package org.cap.demo.hackerrankexampl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PossibleWaysSumOfAmount {

	public static void main(String[] args) {

		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		number = sc.nextInt();
		Map<Integer, Integer> map = new LinkedHashMap<>();
		map.put(10, 5);
		map.put(2, 10);
		map.put(5, 50);
		map.forEach((k, v) -> {
			int num = number;
			int s = num % k;
			num = num / k;
			if (s == 0 && num <= v) {
				System.out.println(k + " " + num);

			} else if (s == 0 && num > v) {

				map.forEach((k2, v2) -> {
					int num2 = number - k * v;
					if (k2 != k) {
						int s2 = num2 % k2;
						num2 = num2 / k2;
						if (s2 == 0 && num2 <= v) {
							System.out.println(k + " " + v + "  " + k2 + " " + num2);

						}
					}
				});
			}
		});

	}

}
