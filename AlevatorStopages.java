package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AlevatorStopages {
	public static void main(String[] args) {
		int a[]= {60,80,40};
		int b[]= {2,3,5};
		//int a[]= {40,40,100,80,20};
		//int b[]= {3,3,2,2,3};
		int capacity= 200;
		int numbOfFloors=5;
		int numOfPeople=3;
		int sum=0;
		long count=1;
		for(int i=0;i<numOfPeople;i++) {
			sum += a[i];
			
			if(sum == capacity) {
				if(i == numOfPeople -1) {
					count = count+Arrays.stream(b).distinct().count()+1;
				}
				else {
					Set<Integer> set= new HashSet<>();
					for(int j=0;j<=i;j++) {
						set.add(b[j]);
					}
					count = count+set.size()+1;
				}
				
			}
			else if(sum > capacity) {
				sum -= a[i];
				Set<Integer> set= new HashSet<>();
				for(int j=0;j<i;j++) {
					set.add(b[j]);
				}
				count = count+set.size();
			}
			else if(sum < capacity && (i+1 == numOfPeople )) {
				count = count+Arrays.stream(b).distinct().count()+1;
			}
		}
		System.out.println(count);
	}

}
