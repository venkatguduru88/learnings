package org.cap.demo.coderpad;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SumOfMinElemFormNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		Integer number = sc.nextInt();
		Integer[] arr = { 1, 2, 3, 4 };
		// List<Integer> list=Arrays.asList(array);
		Map<String, Integer> map = new LinkedHashMap<>();
		for (int k = 0; k < arr.length-1; k++) {
			int sum = 0;
			int seqSum = arr[k];
			for (int j = k + 1; j < arr.length; j++) {
				sum = arr[k] + arr[j];
				seqSum = seqSum + arr[j];
				if (sum == number) {					
					map.put(arr[k] + "+" + arr[j], 2);
				}
				if (seqSum == number) {
					
					StringBuilder builder = new StringBuilder();
					for (int i = k; i <= j; i++) {
						builder.append(arr[i] + "+");
					}
					builder.deleteCharAt(builder.length() - 1);
					map.put(builder.toString(), j+1);
				}

			}

		}
		// System.out.println(map);
		int min = 0;
		if (map.size() != 0) {
			min = Collections.min(map.values());
			System.out.println("Minimun Nubers req is : "+min );
			for (Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue() == min) {
					System.out.println(entry.getKey() + "=" + number);
				}
			}
		}
		else 
		{
			System.out.println("target value "+number+" is out of scope  -1 ");	
		}

	}

}
