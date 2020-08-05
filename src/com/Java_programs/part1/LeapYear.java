package com.Java_programs.part1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
  //divisible by 4 for all the century years -----ending with 00
		
  //century year is leap year when it is only divisible by 400
  
  //1900 is not a leap year
  //2012 is a leap year
		  
		Scanner reader =new Scanner(System.in);
		System.out.println("Enter any Year");
		int year = reader.nextInt();
		boolean leap=true;
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					leap=true;
				}else 
					leap=false;
			}else
				leap =true;
			
		}else
			leap=false;
		
		
		if(leap) {
		 
			System.out.println(year +" is a leap year");
		}else
			System.out.println(year+" is not a leap year");
		
		
		
		
		}
	
	}
