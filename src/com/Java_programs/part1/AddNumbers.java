package com.Java_programs.part1;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("enter value a=");
		int a=sca.nextInt();
        System.out.println("enter value b=");
        int b=sca.nextInt();
        int c=a+b;
        System.out.println("Sum of a and b="+c);

	}

}
