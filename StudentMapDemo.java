package com.technoelevate.java.map;

import java.util.HashMap;

public class StudentMapDemo {

	public static void main(String[] args) {
		HashMap<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(123,"Raghu"),301);
		map.put(new Student(124,"Rahul"),302);
		map.put(new Student(125,"Ram"),303);
		map.put(new Student(126,"Ravi"),304);
		
		System.out.println(map);
	}

}
