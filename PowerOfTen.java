package org.cap.demo.coderpad;

import java.util.Arrays;
import java.util.List;

public class PowerOfTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] input = { 1, 10, 100, 200 };
		// Integer[] input = {-2,-4,3};
		List<Integer> list = Arrays.asList(input);
		list.forEach(e -> {
			int temp = e;
			if(e>9) {
			while (e % 10 == 0) {
				e /= 10;
			}
			if (e == 1) {
				System.out.println(temp + " is power of 10");

			} else
				System.out.println(temp + " is not power of 10");
			}
			else
				System.out.println(temp + " is not power of 10");

		});

	}

}
