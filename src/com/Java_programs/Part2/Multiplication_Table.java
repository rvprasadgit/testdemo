package com.Java_programs.Part2;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {

		Scanner reader=new Scanner(System.in);
		System.out.println("Enter any number to generate table:");
		  int num=reader.nextInt();
		  
		  for(int i=1; i<=10 ;i++) {
			 
			  System.out.println(num+" x "+ i+ " = " +(num*i));
		  }
	}

}
