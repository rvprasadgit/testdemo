package com.Java_programs.Part2;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		// !5=5*4*3*2*1=120
		
		Scanner reader =new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial");
		
		int n=reader.nextInt();
	
		int fact=1;
		
		for (int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(n+" factorial is = " +fact);
	}

}
