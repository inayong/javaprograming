package com.ruby.java.ch09;

import java.util.Arrays;

public class Test16 {
	public static void main(String[] args) {
		int score[] = {81,52,3,14,25,66};
		Arrays.sort(score);
		for (int num : score) {
			System.out.println(num);
		}
		String s1 = Arrays.toString(score);
		System.out.println(s1);
		Arrays.binarySearch(score, 14);
	}
}
