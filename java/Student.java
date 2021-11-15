package com.technoelevate.java.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
	
	
		public static void main(String[] args) {
		List<StudentClass> list=new ArrayList<StudentClass>();
		list.add(new StudentClass(124,23,"Ravi"));
		list.add(new StudentClass(123,22,"Raghu"));
		list.add(new StudentClass(125,24,"Ram"));
		Collections.sort(list);
		System.out.println(list);
		
	}

}
