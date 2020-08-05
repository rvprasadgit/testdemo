package com.Java_programs.Part2;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
   
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter any character Value");
		char c=reader.next().charAt(0);
		
		if((c>='a' && c<='z')||(c>='A' && c<='Z')) {
			System.out.println(c +" is a alphabet");
		}else
			System.out.println(c +" is not  a alphabet");
	}

}
