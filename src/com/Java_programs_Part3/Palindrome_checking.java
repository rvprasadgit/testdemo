package com.Java_programs_Part3;

import java.util.Scanner;

public class Palindrome_checking {

	public static void main(String[] args) {
     
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter any string for palindrome checking");
		String original=reader.nextLine();
		String rev ="";
		
		int length =original.length();
		for(int i=length-1;i>=0;i--) {
  
			rev=rev+original.charAt(i);
		}
			  if(original.equals(rev)) 
			    	System.out.println("Entered string " +original+"  is a palindrome");
				
			else
				System.out.println("Entered string " +original+"  is not a palindrome");
		
	
	  
	}
	
}
