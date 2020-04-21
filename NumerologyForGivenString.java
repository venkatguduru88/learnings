package org.cap.demo.hackerrankexampl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumerologyForGivenString {

	public static void main(String[] args) {
		//A,I,J,Q,Y - 1
		//B,K,R-2
		//C,G,L,S - 3
		//D,M,T - 4
		//E,H,N,X -5
		//U,V,W-6
		//O,Z-7
		//F-P-8
		List<Character> list= new ArrayList<>(Arrays.asList('A','I','J','Q','Y'));
		List<Character> list2= new ArrayList<>(Arrays.asList('B','K','R'));
		List<Character> list3= new ArrayList<>(Arrays.asList('C','G','L','S'));
		List<Character> list4= new ArrayList<>(Arrays.asList('D','M','T'));
		List<Character> list5= new ArrayList<>(Arrays.asList('E','H','N','X'));
		List<Character> list6= new ArrayList<>(Arrays.asList('U','V','W'));
		List<Character> list7= new ArrayList<>(Arrays.asList('O','Z'));
		List<Character> list8= new ArrayList<>(Arrays.asList('F','P'));
		Map<Integer,List<Character>> map =new LinkedHashMap<>();
		map.put(1, list);
		map.put(2, list2);
		map.put(3, list3);
		map.put(4, list4);
		map.put(5, list5);
		map.put(6, list6);
		map.put(7, list7);
		map.put(8, list8);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the name :");
		String name=sc.next();
		System.out.println(name);
		List<Integer> numerologyList=new ArrayList<>();
		List<Character> charList=name.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		charList.forEach(c->{
			map.forEach((key,value)-> {
				if(value.contains(c)) {
					numerologyList.add(key);
				}
			});
		});
		Integer sumOfList=numerologyList.stream().reduce(0,Integer::sum);
		int sum=0;
		if(sumOfList>9) {
			
			while(sumOfList>0) {
				sum=sum+ sumOfList % 10;
				sumOfList =sumOfList/10;
			}
			System.out.println(sum);
		}
		else
			System.out.println(numerologyList.stream().reduce(0,Integer::sum));
		
	}
}
