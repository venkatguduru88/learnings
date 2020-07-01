package org.cap.demo.coderpad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeOfCollectionOfIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[][] array= {{2,6},{8,10},{15,18},{1,3}};
		List<Integer[]> list2 = Arrays.asList(array);
		list2.forEach(a->{
			for(int i=1;i<array.length;i++) {
				//System.out.println(a[0]+" "+a[1] +"\n"+array[i][0]+" "+array[i][1]);
				if(a[0]>array[i][0] && a[0]<array[i][1]) {					
					System.out.println("("+a[0]+","+a[1]+") and ("+array[i][0]+","+array[i][1]+") are overlapping ");
					List<Integer> list = new ArrayList<>(Arrays.asList(a));
					list.addAll(Arrays.asList(array[i]));
					System.out.println(Collections.min(list)+","+Collections.max(list));
				}
			}
		});

	}

}
