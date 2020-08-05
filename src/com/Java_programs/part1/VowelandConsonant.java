package com.Java_programs.part1;

import java.util.Scanner;

public class VowelandConsonant {

	public static void main(String[] args) {

		
		  Scanner reader=new Scanner(System.in);
		  System.out.println("Enter any alphabet");
		   char ch=reader.next().charAt(0);
			
			  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			  System.out.println(ch+" is an VOWEL"); }else
			  System.out.println(ch+" is a consonant");
			 
		
		
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch+" is an VOWEL");
			break;
			default:
				System.out.println(ch+" is a consonant");
				break;
			
		
		
		
		}
	}

}
