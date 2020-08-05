package com.Java_programs_Part3;

import java.util.Scanner;

public class SimpleCalcUsingSwitch {

	public static void main(String[] args) {

		Scanner reader =new Scanner(System.in);
		 System.out.println("Enter first value ");
				double first= reader.nextDouble();
		 System.out.println("Enter second value ");
                double second=reader.nextDouble();		
                
                System.out.println("Enter any operators like (+,-,*,/)");
                char  operator= reader.next().charAt(0);
                
                double result;
                
                switch(operator) {
                
                case  '+' :
                	    result=first+second;
                	    System.out.println(result);
                	    break;
                case  '-' :
            	        result=first-second;
            	        System.out.println(result);
            	        break;	
                	
                case  '*' :
            	        result=first*second;
            	        System.out.println(result);
            	        break;
                
                case  '/' :
            	        result=first/second;
            	        System.out.println(result);
            	        break;
                case  's' :
        	        result=(first*second)/100;
        	        System.out.println(result);
        	        break;     
            	        
            	        
               default :
            	        
            	        System.out.println("Error");;
            	    
                }
		
                
	}

}
