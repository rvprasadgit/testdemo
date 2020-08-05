package com.Java_programs.Part2;

import java.util.Scanner;

public class ReverseANum {

	public static void main(String[] args) {

		Scanner reader =new Scanner(System.in);
		System.out.println("Enter any Integer to reverse it");
		
		int num=reader.nextInt();
		int rev=0;
		
		while(num!=0) {
		int digit = num%10;
		rev=rev*10+digit;
		
		num/=10;
	}
		System.out.print(rev+" is the reversed number   ");
		
	}

}
