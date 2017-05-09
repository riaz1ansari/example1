package com.excercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterate {

	public static void main(String[] args) {
		Map<Integer,Map<Object,Object>> map=new HashMap<Integer, Map<Object,Object>>();
		
		Map<Object,Object> objMap1=new HashMap<Object, Object>();
		objMap1.put("name", "riaz");
		objMap1.put("address", "noida");
		
		Map<Object,Object> objMap2=new HashMap<Object, Object>();
		objMap2.put("id", 12);
		objMap2.put("price", 5000.0);
		
		map.put(1,objMap1);
		map.put(2,objMap2);
		
		iterate(map);
		
	}

	public static void iterate(Map<Integer, Map<Object, Object>> map){
		
		Iterator<Integer> itr=map.keySet().iterator();
		
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			Map<Object,Object> objmap= map.get(integer);
			System.out.print("Iterrating for outer key:"+integer+"[");
			Iterator<Object> objitr=objmap.keySet().iterator();
			while (objitr.hasNext()) {
				Object key=objitr.next();
				System.out.print("{key:"+ key +" ,value:"+objmap.get(key)+"}");
			}
			System.out.print("]");
			System.out.println();
		}
		
	}
}
