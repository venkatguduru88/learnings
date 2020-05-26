package org.cap.demo.funinter;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsingJava8ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = {3,2,7,5,8,9}; //3
		Integer b[]= {13,25};
		Integer c[]= {13,5,2,22,7,40,80};
		Map<List<Integer>,Integer> map= new LinkedHashMap<>();
		List<Integer[]> list= Arrays.asList(a,b,c);
		list.forEach(e->{
			Integer temp =0;
			Integer count = 0;
			for(Integer num:e) {
				if(temp<num) {
					if(temp!=0) {
						count++;
					}
				}
				temp = num;
			}
			//temp=temp+Arrays.stream(e).reduce(temp ,(aa,bb)->(aa<bb)?1:0);
			map.put(Arrays.stream(e).collect(Collectors.toList()), count);
		});
		int max= Collections.max(map.values());
		map.forEach((k,v)->{
			if(max ==v) {
				System.out.println(k+"  "+v);
			}
			
		});
		//map.forEach((k,);

	}

}
