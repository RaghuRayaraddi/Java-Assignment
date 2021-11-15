package com.technoelevate.java.collection.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class PersonClass {

	public static void main(String[] args) {
		HashSet<Person>hashSet=new HashSet<Person>();
		hashSet.add(new Person("Raghu","Hubli", 23));
		hashSet.add(new Person("Ram","Bijapur", 22));
		hashSet.add(new Person("Ravi","Mudhol", 24));
		ArrayList<Person>arrayList=new ArrayList<Person>(hashSet);
		Collections.sort(arrayList);
		System.out.println(arrayList);
	}

}
