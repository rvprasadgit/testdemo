package com.Java_programs.Part2;

public class FibonacciSeries {

	public static void main(String[] args) {

		//0 1 1 2 3 5 8 13
		
		int n1=0,n2=1,n3,count=10;
		 
		System.out.print(n1+ " " +n2);
		int i=2;
		while( i<count){ 
		n3=n1+n2;
		
		System.out.print(" "+n3);
		
		n1=n2;
		n2=n3;
		
		i++;
		}
		
	}

}
