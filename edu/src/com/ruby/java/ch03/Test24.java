package com.ruby.java.ch03;

import java.util.Scanner;

public class Test24 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("nation:");
		String nation = sc.next();
		
		switch(nation) {
		case "KOR":
		case "JPN":
		case "CHN":
			System.out.println("아시아");
			break;
		case "GBR":
		case "FRA":
		case "EUA":
			System.out.println("유럽");
			break;
		case "UST":
		case "CAN":
		case "MEX":
			System.out.println("아메리카");
			break;
		}
	}
}
