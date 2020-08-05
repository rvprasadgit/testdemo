package com.Java_programs_Part3;

import java.util.Scanner;

public class PrimeNumsBwnRange {

	public static void main(String[] args) {

		Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter lower value of prime number range :");
		 int low=reader.nextInt();
		
		 System.out.println("Enter higher value of prime number range :");
		 int high=reader.nextInt();
		
		
		for(int i=low;i<=high;i++)
		{
			boolean flag=true;
			
			for(int j=2;j<=i-1;j++) 
			{
				
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if (flag==true) {
				 System.out.print(i+" ");
			}
			
		}
		
	
        }
			
	}


