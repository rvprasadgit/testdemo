package com.Java_programs_Part3;

import java.util.Scanner;

public class FactorsOfANUmber {

	public static void main(String[] args) {

		Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter any number to check all factors of it :");
		int num=reader.nextInt();
		int temp=num;
		
		System.out.println(temp+" has all these factors :");
		
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				System.out.println(i);
				
			}
			
		}
		
	}

}
