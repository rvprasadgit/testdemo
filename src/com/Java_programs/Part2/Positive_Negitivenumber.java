package com.Java_programs.Part2;

import java.util.Scanner;

public class Positive_Negitivenumber {

	public static void main(String[] args) {

		Scanner reader =new Scanner(System.in);
		System.out.println("Enter any number");
	        double num=	reader.nextDouble();
	        
	        if(num>0.0) {
	        	System.out.println(num+" is a positive number");
	        }
	        if(num<0.0) {
	        	System.out.println(num+" is a negative number");
	        }else
	        	System.out.println(num+" is a zero");
	        
	        
	}

}
