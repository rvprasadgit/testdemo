package com.Java_programs.part1;

public class Arraylist {

	public static void main(String[] args) {

		Arraylist ar=new Arraylist();
		int abc=ar. hashCode();
		try {
			ar.clone();
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		System.out.println(abc);
	}

}
