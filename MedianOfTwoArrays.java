package com.test.rollstring;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MedianOfTwoArrays {
	public static void main(String[] args) {
		
		Integer arra1[]={2,3,6,7,9};
		
		Integer arra2[]={-1,4,8,10,11,3};
		Number median=0;
		
		List<Integer> list=Stream.concat(Arrays.asList(arra1).stream(), Arrays.asList(arra2).stream()).sorted().collect(Collectors.toList());
		System.out.println(list+"\n size : "+list.size());
		int size=list.size();
		int half=size/2;
		
		if((size%2) == 0){
		
			median=(list.get(half).floatValue()+list.get(half-1).floatValue())/2;
		}
		else
			median=list.get(half);
		
		System.out.println(median);
			
	}
	
	
	
	
	
	
	

}
