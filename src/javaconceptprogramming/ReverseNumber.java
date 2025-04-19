package javaconceptprogramming;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		//Using Algorithm 2.Stringbuffer class and StringBuilder class
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number:");
		
		int num=sc.nextInt();
				
	    int rev=0;
		
		while (num!=0)
			
		{
			rev=rev*10 + num%10; //0+123%10=4 40+3=43 430+2=432 4320+1=4321
			num=num /10; //1234/10=123 123/10=12 12/10=1 1/10=0
		}
       System.out.println("Reverse number is:" + rev);
	}

}
