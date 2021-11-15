package com.technoelevate.java.collection.sort;

public class StudentClass implements Comparable<StudentClass> {
	int id,age;
	String name;
	public StudentClass(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	
	}
	@Override
	public int compareTo(StudentClass o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	@Override
	public String toString() {
		return "StudentClass [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
}
