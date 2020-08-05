package com.Java_programs.part1;

import java.util.Scanner;

public class LargestAmongThreeNums {

	public static void main(String[] args) {

		Scanner reader =new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1=reader.nextInt();
		System.out.println("Enter num2:");
		int num2=reader.nextInt();
		System.out.println("Enter num3:");
		int num3=reader.nextInt();
	
		if (num1>num2&& num1>num3) {
			
			System.out.println(num1+ " is the largest among three");
		}else if(num2>num3){
			
			System.out.println(num2+ " is the largest among three");

		}else
			System.out.println(num3+ " is the largest among three");

		
		
		
		
		
	}
	
}
