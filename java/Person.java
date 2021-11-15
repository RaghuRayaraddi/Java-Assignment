package com.technoelevate.java.collection.hashset;

public class Person implements Comparable<Person>{
	String name,place;
	int age;
	public Person(String name, String place, int age) {
		super();
		this.name = name;
		this.place = place;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", place=" + place + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Person o) {
		return this.age;
	}
	
}
