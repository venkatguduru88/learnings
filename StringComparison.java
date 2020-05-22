package org.cap.demo.coderpad;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringComparison {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ::");
		String str = sc.next();
		List<Character> list=str.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
		StringBuilder builder = new StringBuilder();
		list.stream().distinct().forEach(e ->{
			builder.append(e);
			builder.append(Collections.frequency(list,e));
			
		});
		System.out.println(builder);
	}

}
