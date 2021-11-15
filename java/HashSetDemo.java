package com.technoelevate.java.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hashset=new HashSet();
		hashset.add(10);
		hashset.add("Raghu");
		hashset.add(10);
		hashset.add(20);
		System.out.println(hashset);
		System.out.println("======using for each loop======");
		for (Object object : hashset) {
		System.out.println(object);
		}
		System.out.println("=======using Iterator and iterator()==========");
		 Iterator iterator = hashset .iterator();
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next());
		 }
	}

}
