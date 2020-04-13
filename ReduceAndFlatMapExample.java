package org.cap.demo.funinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceAndFlatMapExample {

	public static void main(String[] args) {

		String[][] data = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		// Stream<String[]>
		Stream<String[]> temp = Arrays.stream(data);

		List<String> stringStream = temp.flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());

		System.out.println(stringStream);

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9);

		List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

		List<Integer> listOfAllIntegers = listOfLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(listOfAllIntegers);

		List<Integer[]> listOfArrays = new ArrayList<>();
		listOfArrays.add(new Integer[] { 1, 2, 3 });
		listOfArrays.add(new Integer[] { 4, 5, 6 });
		listOfArrays.add(new Integer[] { 7, 8, 9 });

		List<Integer> ls = listOfArrays.stream().flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());
		System.out.println(ls);
		
		// Creating a List of Strings 
        List<String> list = Arrays.asList("asdf", "qwer","asdfgrth", "gfg"); 
  
        // Using Stream flatMapToInt(Function mapper) 
        // to get length of all strings present in list 
        list.stream().flatMapToInt(str -> IntStream.of(str.length())). 
        forEach(System.out::println);
        //reduce
        int sum =ls.stream().reduce(0, Integer::sum);
        System.out.println("Sum : "+sum);
        int min=ls.stream().reduce(0, Integer::min);
        System.out.println("Minimun value : "+min);
        int max=ls.stream().reduce(0, Integer::max);
        System.out.println("Maximim value : "+max);
	}

}
