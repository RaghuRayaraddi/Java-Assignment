package com.technoelevate.java.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(318, "Avinash");
		map.put(308, "Sandesh");
		map.put(317, "Vishnu");
		map.put(320, "Vijay");
		map.put(301, "Ganesh");
		map.put(313, "Sidharood");
		
		System.out.println(map);  
//		Set<Integer> set= map.keySet();
//		System.out.println(set);
//		
//		Collection<String> collection= map.values()	;
//		System.out.println(collection);
//		
//		Set entries= map.entrySet();
//		Iterator iterator= entries.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		for (Map.Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
			if(entry.getKey()==308) {
				entry.setValue("Megha");
			}
			
//			if(entry.getValue().equals("Sandesh")) {
//				((Object) entry).setKey(309);
//			}
		}
		System.out.println(map);
		}
		
}


