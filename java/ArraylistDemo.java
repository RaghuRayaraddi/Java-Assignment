package com.technoelevate.java.collectionarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(10);
		arrayList.add(30);
		arrayList.add(40);

		System.out.println(arrayList);
		System.out.println("=====usinf for loop=====");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));

		}
		System.out.println("======using for each loop=========");
		for (Object object : arrayList) {
			System.out.println(object);
			
		}
		System.out.println("=======using Iterator and iterator()==========");
		 Iterator iterator = arrayList.iterator();
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next());
		 }
		 System.out.println("=======using ListIterator forward print=========");
		 ListIterator listIterator2= arrayList.listIterator();
		 while(listIterator2.hasNext()) {
			 System.out.println(listIterator2.next());
		 }
		 System.out.println("=======using ListIterator backward print=========");
		 ListIterator listIterator3 = arrayList.listIterator(arrayList.size());
		 while(listIterator3.hasPrevious()) {
			 System.out.println(listIterator3.previous());
		 }
;	}

}
