package com.technoelevate.java.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList linkedlist =new LinkedList();
		linkedlist.add("Raghu");
		linkedlist.add("Akshay");
		linkedlist.add("Vishnu");
		linkedlist.add("Siddhu");
		System.out.println(linkedlist);
		System.out.println("======using for each loop======");
		for (Object object : linkedlist) {
			System.out.println(object);
		}
		System.out.println("=======using Iterator and iterator()==========");
		 Iterator iterator = linkedlist.iterator();
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next());
		 }
	}

}
