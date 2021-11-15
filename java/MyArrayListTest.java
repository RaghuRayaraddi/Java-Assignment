package com.technoelevate.java.myownimplimentation;

public class MyArrayListTest {

	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList(5);
		myArrayList.add(10);
		myArrayList.add(20);
		myArrayList.add(30);
		myArrayList.add(40);
		myArrayList.add(30);
		myArrayList.add(40);
		myArrayList.add(30);

		System.out.println(myArrayList.get(0));
		System.out.println(myArrayList.get(1));
		System.out.println(myArrayList.size());
		System.out.println(myArrayList);
	/*	Iterator iterator = myArrayList.iterator();
		System.out.println("========using iterator=========");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		} */
	}

}
