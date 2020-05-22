package org.cap.demo.coderpad;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Integer[] input = {-2,-4,3};
		Integer[] input = {6,3,2,7,8,45,32,1};
		List<Integer> list=  Arrays.asList(input).stream().sorted().collect(Collectors.toList());
		//System.out.print(list+"\n"+list.size()+"\n");
		System.out.println(list.get(list.size()-2));
		//System.out.println(Collections.min(list));
		//System.out.println(Collections.max(list));

	}

}
