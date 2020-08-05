package com.Java_programs_Part3;

import java.util.Scanner;

public class PowerofNUM {

	public static void main(String[] args) {

		Scanner reader=new Scanner(System.in);
		System.out.println("enter number");
		int number=reader.nextInt();
		System.out.println("enter power");
		int power=reader.nextInt();
		int result=1;
		
		if (number>=0&&power==0) {
			 result=1;
		}else if (number==0&&power>1) {
		  result=0;	
		}else
		{
			for(int i=1;i<=power;i++) {
				result*=number;
			}
		}
			System.out.println(number+" power "+power +" = "+result);
			
			// another wAY is 
			 System.out.println(Math.pow(number, power));
		
	}

}
