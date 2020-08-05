package com.Java_programs_Part3;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {

		Scanner reader=new Scanner(System.in);
      
		System.out.println("Enter any number to check armstong or not :");
		
		int number=reader.nextInt();
	    int	temp=number;
	    
		int a,c=0;
		
		while(number>0) {
			 a=number%10;
			c=c+(a*a*a);
			number=number/10;
			
		}
		if (temp==c) {
			System.out.println(temp+" is an armstrong number");
		}else
			System.out.println(temp+"  is not an armstrong number");
	
		
	}

}
