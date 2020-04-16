package com.test.rollstring;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

	public static void main(String ar[])

	{

		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum = 0;
			List<Integer> list = new ArrayList<>();
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
					list.add(j);
				}
			}
			if (sum == i && sum != 0) {
				System.out.print(list + "  " + i + "\n");

			}

		}
	}
}
