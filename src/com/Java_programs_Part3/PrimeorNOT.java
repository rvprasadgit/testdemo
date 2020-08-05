package com.Java_programs_Part3;

import java.util.Scanner;

public class PrimeorNOT {

	public static void main(String[] args) {

		Scanner reader=new Scanner(System.in);
		System.out.println("Enter any Number to check is it prime or not");
		int num= reader.nextInt();
		
		int temp=0;
		
		for(int i=2; i<=num-1; i++) {
			if(num%i==0) {
				temp=temp+1;
			}
		}
		
		if(temp>0) {
			System.out.println(num+" is a not prime number");
		}else
			System.out.println(num+" is a prime");
		
	}

}
