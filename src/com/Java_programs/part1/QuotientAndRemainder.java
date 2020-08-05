package com.Java_programs.part1;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
      
		Scanner reader =new Scanner(System.in);
		System.out.println("enter dividend");
        
		int a=reader.nextInt();
		System.out.println("enter divisor");
		
		int b=reader.nextInt();
		
		int c=a/b;
		int d=a%b;
		System.out.println("Quotient is ="+c);

		System.out.println("Remainder is ="+d);
	}

}
