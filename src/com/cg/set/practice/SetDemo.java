package com.cg.set.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> set= new HashSet<Integer>();
		
		set.add(3);
		set.add(35);
		set.add(5);
		//set.add(3);
		
//		for(int i : set) {
//			System.out.println(i);
//		}
		Iterator<Integer> itr= set.iterator();
		while(itr.hasNext()) {
			int a=itr.next();
			System.out.println(a);
		}

	}

}
