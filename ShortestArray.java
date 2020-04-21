package org.cap.demo.hackerrankexampl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ShortestArray {
	
	public static void main(String[] args) {
		//{1,2,3,4},{0,2,7},{4,12},{1,2,5,6}
		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(1,2,3,4));		
		list.add(Arrays.asList(0,2,7));
		list.add(Arrays.asList(4,12));
		list.add(Arrays.asList(1,2,5,6));
		//int min=0;
		int size=0;
		List<Integer> sizeList=list.stream().map(s-> s.size()).collect(Collectors.toList());
		int min =Collections.min(sizeList);
		System.out.println(list.get(sizeList.indexOf(min)));
		
		List<Integer> intList=new ArrayList<>();
		intList.add(2);
		intList.add(2);
		System.out.println(intList);
		System.out.println(intList.indexOf(2));
		
		
	}

}
