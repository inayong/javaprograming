package com.ruby.java.ch07.상속;

public class LMSTest {
	public static void main(String[] args) {
		Employee e = new Employee("오정임", 47, "입학처");
		Professor p = new Professor("김푸름", 52, "빅데이터");
		Student s = new Student("김유빈", 20, "컴퓨터과학");
		
//		e.setName("오정임");
//		e.setAge(47);
//		e.setDept("입학처");
//		
//		p.setName("김푸름");
//		p.setAge(52);
//		p.setSubject("빅데이터");
//		
//		s.setName("김유빈");
//		s.setAge(20);
//		s.setMajor("컴퓨터과학");
		
		e.setName("hong");
		e.setAge(11);
		e.setDept("Computer");
		
		p.setName("kim");
		p.setAge(20);
		p.setSubject("DB");
		
		s.setName("jang");
		s.setAge(30);
		s.setMajor("java");
		
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}
