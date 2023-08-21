package com.ruby.java.ch07.상속;

public class Person {
	private final String ssn_ID = "1234";
	private String name;
	private int age;
	
	public void setSsn_ID(String ssn_ID) {
//		this.ssn_ID = ssn_ID; //값을 변경하는 것을 허용하지 않는다.
	}
	/*
	public Person(String ssn_ID) {
		this.ssn_ID = ssn_ID;
	}
	*/
	public Person() {
		System.out.println("Person 생성자 실행");
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "name = " + name + " , " + "age = " + age;
	}
}
