package com.Java_programs.Part2;

import java.util.Scanner;

public class naturalNumbersSum {

	public static void main(String[] args) {

		//1+2+3+4+5+.....+100 =>5050
		Scanner reader=new Scanner(System.in);
	    System.out.println("Enter num value to sum from one to");
		int num =reader.nextInt();
		int sum=0;
		int sum11=0;
		for (int i=1;i<=num;i++) {
			sum=sum+i;
		}	
		System.out.println("sum of natural numbers upto " +num +"= " +sum);
	
	int k=1;
	while( k<=num) {
		 sum11=sum11+k;
		k++;
	}
	System.out.println("sum of natural numbers upto " +num +"= " +sum);
	
	}
	
	

}
