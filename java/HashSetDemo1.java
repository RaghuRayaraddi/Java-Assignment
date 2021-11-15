package com.technoelevate.java.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet<Integer> hash = new HashSet();
		hash.add(10);
		hash.add(20);
		hash.add(30);
		hash.add(10);
		hash.add(40);
		hash.add(20);
		System.out.println(hash);
		System.out.println("======using for each loop======");
		for (Object object : hash) {
		System.out.println(object);
		}
		System.out.println("=======using Iterator and iterator()==========");
		 Iterator iterator = hash.iterator();
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next());
		 }
	}

}
