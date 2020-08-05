package com.Java_programs.part1;

public class Swap2Numbers {

	public static void main(String[] args) {
    
		int a=10;
		int b=20;
		/*
		 * System.out.println("before swapping :"); System.out.println("a="+a);
		 * System.out.println("b="+b);
		 */
		
		a=a+b;
		b=a-b;
		a=a-b;
		

		 System.out.println("a="+a);
		  System.out.println("b="+b);
	}

}
