package javaconceptprogramming;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		/*
Factorial Program in Java: Factorial of n is the product of all positive 
descending integers. 
Input = 5! 
Output = 5! = 5*4*3*2*1 = 120 
		 */
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		
		int fact=1;
		
		for (int i=1; i<=num; i++)
		{
		fact=fact*i;
		}
System.out.println("Factorial of"+ " "+ num + " is " + fact);
	}

}
