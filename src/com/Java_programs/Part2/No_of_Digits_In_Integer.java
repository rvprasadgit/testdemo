package com.Java_programs.Part2;

import java.util.Scanner;

public class No_of_Digits_In_Integer {

	public static void main(String[] args) {


		Scanner reader =new Scanner(System.in);
		System.out.println("Enter any Integer to count digits");
		long num=reader.nextLong();
		int count=0;
		while (num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("No of Digits : " +count);
		
	}

}
