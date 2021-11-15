package com.technoelevate.java.collection.treeset;

public class TreeSetDemo implements Comparable<TreeSetDemo> {
	int id;
	String name;
	int age;
	public TreeSetDemo(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(TreeSetDemo o) {
		return this.age;
	}
	@Override
	public String toString() {
		return "TreeSetDemo [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
