package com.cg.map.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		
		Map<String,Integer> obj = new HashMap<>(); 
		obj.put("Sam",348);
		obj.put("abc",346);
		obj.put("fgh",349);
		obj.put("def",342);

		//System.out.println(obj.get(349));
		obj.remove("def");
		
		Set<String> keys = obj.keySet();
		{
			for(String i : keys)
				System.out.println(i+" "+obj.get(i));
		}
//
//		Set<Map.Entry<String,Integer>> values = obj.entrySet();
//		for(Map.Entry<String,Integer> e : values) {
//			System.out.println(e.getKey()+" : " +e.getValue());
//			e.setValue(1);
//		}
	}

}
