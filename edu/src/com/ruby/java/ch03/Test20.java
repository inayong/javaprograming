package com.ruby.java.ch03;

import java.util.Scanner;

public class Test20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("score:");
		int score = sc.nextInt();
		
		char grade;
		char plus = ' ';
		
		if(score >= 95) {
			grade = 'A';
			plus = '+';
		}
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(grade);
		System.out.println(plus);
	}
}
