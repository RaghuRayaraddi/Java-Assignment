package com.technoelevate.java.collection.treeset;

import java.util.TreeSet;

public class MainTreeSetClass {

	public static void main(String[] args) {
		 TreeSet<TreeSetDemo> set=new TreeSet<TreeSetDemo>();
		 set.add(new TreeSetDemo(123,"Raghu",23));
		 set.add(new TreeSetDemo(124,"Rahul",21));
		 set.add(new TreeSetDemo(125,"Ram",22));
		 set.add(new TreeSetDemo(126,"Ravi",25));
		 
		 for(Object o:set) {
			 System.out.println(o);
		 }
	}

}
