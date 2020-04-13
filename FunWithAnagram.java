package org.cap.demo.hackerrankexampl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FunWithAnagram {

	public static String key(String word) {
		char[] chrs = word.toCharArray();
		Arrays.sort(chrs);
		return new String(chrs);
	}

	public static List<String> funWithAnagrams(List<String> list) {
		List<String> ans = new LinkedList<String>();
		Set<String> found = new HashSet<String>();
		for (String word : list) {
			String key = key(word);
			if (!found.contains(key)) {
				ans.add(word);
				found.add(key);
			}
		}
		return ans;
	}

	// code, doce, ecod, framer, frame,farmer
	// poke,pkoe,okpe,ekop
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of words in String : ");
		int number = sc.nextInt();
		System.out.println("Please enter the String : ");
		for (int i = 0; i < number; i++) {
			list.add(sc.next());
		}
		System.out.println(list);
		System.out.println(funWithAnagrams(list));

	}

}
