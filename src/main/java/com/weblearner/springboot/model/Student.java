package com.weblearner.springboot.model;

public class Student {
	
	private String name;

	private String dept;

	private int age;

	public Student() {

	}

	public Student(String name, String dept, int age) {
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public int getAge() {
		return age;
	}

	
	

}
